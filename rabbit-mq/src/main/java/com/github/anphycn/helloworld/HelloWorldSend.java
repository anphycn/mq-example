//package com.github.anphycn.controller.helloworld;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDateTime;
//
//@Component
//public class HelloWorldSend {
//
//    protected static Logger logger = LoggerFactory.getLogger(HelloWorldSend.class);
//
//    @Autowired
//    private AmqpTemplate rabbitTemplate;
//
//    public String send(String context) {
//        logger.debug(LocalDateTime.now() + "HelloworldP: " + context);
//        this.rabbitTemplate.convertAndSend("helloWorldQueue", context);
//        return context;
//    }
//}
