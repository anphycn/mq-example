package com.github.anphycn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMqConsumerApplication {
    private final static Logger logger = LogManager.getLogger(RabbitMqConsumerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RabbitMqConsumerApplication.class, args);
        logger.info("RabbitMqConsumerApplication启动成功");
    }
}
