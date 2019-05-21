package com.github.anphycn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsocketApplication {
    private final static Logger logger = LogManager.getLogger(WebsocketApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WebsocketApplication.class, args);
        logger.info("WebsocketApplication启动成功");
    }
}
