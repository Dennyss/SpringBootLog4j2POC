package com.poc.logger.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Denys Kovalenko on 4/4/2017.
 */
@Configuration
public class SpringConfiguration implements InitializingBean, DisposableBean {
    private static Logger logger = LogManager.getLogger(SpringConfiguration.class);

    @Override
    public void afterPropertiesSet() throws Exception {
        for(;;){
            logger.info("Logging application message");
            Thread.currentThread().sleep(1000);
        }
    }

    @Override
    public void destroy() throws Exception {
        logger.info("Destroy...");
    }
}
