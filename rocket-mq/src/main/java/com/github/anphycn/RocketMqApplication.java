package com.github.anphycn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RocketMqApplication {
    private final static Logger logger = LogManager.getLogger(RocketMqApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RocketMqApplication.class, args);
        logger.info("RocketMqApplication启动成功");
    }
}
