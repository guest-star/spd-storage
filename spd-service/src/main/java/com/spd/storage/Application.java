package com.spd.storage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by luoyongchang on 2017/3/17.
 */
@SpringBootApplication
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    private static final String SHUTDOWN_HOOK_KEY = "dubbo.shutdown.hook";
    private static volatile boolean running = true;

    public static void main(String[] args) throws Exception {
        logger.debug("application being start");
        ConfigurableApplicationContext context = new SpringApplicationBuilder()
                .sources(Application.class).web(false).run(args);

        if ("true".equals(System.getProperty(SHUTDOWN_HOOK_KEY))) {
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                context.stop();
                context.close();
                synchronized (Application.class) {
                    running = false;
                    Application.class.notify();
                }
            }));
        }

        synchronized (Application.class) {
            while (running) {
                try {
                    Application.class.wait();
                } catch (InterruptedException e) {
                    logger.error("application blocking error", e);
                }
            }
        }
    }

}
