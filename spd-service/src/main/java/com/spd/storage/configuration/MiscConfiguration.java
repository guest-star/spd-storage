package com.spd.storage.configuration;

import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * Created by luoyongchang on 2017/3/1.
 */
@Configuration
@Order(2)
public class MiscConfiguration {

    /**
     * 注册dubbo扫描basepackage
     *
     * @return
     */
    @Bean
    public AnnotationBean annotationBean() {
        AnnotationBean annotationBean = new DubboAnnotationBean();
        annotationBean.setPackage("com.spd.storage");
        return annotationBean;
    }

    @Bean
    public ProviderConfig providerConfig() {
        ProviderConfig provider = new ProviderConfig();
        provider.setRetries(0);
        provider.setTimeout(5000);

        return provider;
    }

    @Bean
    public ExecutorServiceFactoryBean executorService() {
        return new ExecutorServiceFactoryBean();
    }


}
