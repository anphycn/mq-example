package com.github.anphycn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMqApplication {
    private final static Logger logger = LogManager.getLogger(RabbitMqApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RabbitMqApplication.class, args);
        logger.info("RabbitMqApplication启动成功");
    }
}
