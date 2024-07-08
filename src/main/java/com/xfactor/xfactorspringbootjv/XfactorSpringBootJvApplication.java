package com.xfactor.xfactorspringbootjv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class XfactorSpringBootJvApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringBootApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext appContext = SpringApplication.run(XfactorSpringBootJvApplication.class, args);

        DbConfiguration conf = appContext.getBean(DbConfiguration.class);
        log.debug(conf.toString());
    }

}
