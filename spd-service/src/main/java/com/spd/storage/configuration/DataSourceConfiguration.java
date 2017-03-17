package com.spd.storage.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.dubbo.config.MonitorConfig;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.util.Properties;


@Configuration
@Order(1)
@EnableTransactionManagement
public class DataSourceConfiguration implements TransactionManagementConfigurer {

    @Value("${jdbc.url:jdbc:mysql://118.178.227.79:3306/storage2?autoReconnectForPools=true&useUnicode=true&characterEncoding=UTF-8&useServerPrepStmts=true&tinyInt1isBit=false&useSSL=false}")
    private String url;

    @Value("${jdbc.username:root}")
    private String userName;

    @Value("${jdbc.password:19940416}")
    private String password;

    @Value("${jdbc.driverClassName:com.mysql.jdbc.Driver}")
    private String driverClassName;

    @Value("${dataSource.maxActive:100}")
    private int maxActive;

    @Value("${dataSource.initialSize:3}")
    private int initialSize;

    @Value("${dataSource.maxWait:60000}")
    private Long maxWait;

    @Value("${dataSource.minIdle:3}")
    private int minIdle;

    @Value("${dataSource.timeBetweenEvictionRunsMillis:3000}")
    private Long timeBetweenEvictionRunsMillis;

    @Value("${dataSource.minEvictableIdleTimeMillis:300000}")
    private Long minEvictableIdleTimeMillis;

    @Value("${dataSource.validationQuery:SELECT 1}")
    private String validationQuery;

    @Value("${dataSource.testWhileIdle:true}")
    private boolean testWhileIdle;

    @Value("${dataSource.testOnBorrow:false}")
    private boolean testOnBorrow;

    @Value("${dataSource.testOnReturn:false}")
    private boolean testOnReturn;

    @Value("${dubbo.monitor.address:}")
    private String address;

    @Bean(initMethod = "init", destroyMethod = "close")
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        dataSource.setMaxActive(maxActive);
        dataSource.setInitialSize(initialSize);
        dataSource.setMaxWait(maxWait);
        dataSource.setMinIdle(minIdle);
        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        dataSource.setValidationQuery(validationQuery);
        dataSource.setTestWhileIdle(testWhileIdle);
        dataSource.setTestOnBorrow(testOnBorrow);
        dataSource.setTestOnReturn(testOnReturn);
        return dataSource;
    }

    @Bean("sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:mappers/*-mapper.xml"));
        sqlSessionFactoryBean.setTypeHandlersPackage("com.zto.bill.dal.domain");
        sqlSessionFactoryBean.setConfigLocation(resolver.getResource("classpath:sqlMapConfig.xml"));
        PageHelper plugin = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("dialect", "mysql");
        properties.setProperty("reasonable", "true");
        plugin.setProperties(properties);
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{plugin});
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory());
    }

    @Override
    @Bean
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public MonitorConfig monitorConfig() {
        MonitorConfig monitorConfig = new MonitorConfig();
        monitorConfig.setProtocol("registry");
        if (StringUtils.isNotEmpty(address)) {
            monitorConfig.setAddress(address);
        }
        return monitorConfig;
    }
}
