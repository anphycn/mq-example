package com.github.anphycn.controller.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloWorldProducerController {

    protected static Logger logger= LoggerFactory.getLogger(HelloWorldProducerController.class);

//    @Autowired
//    private HelloWorldSend helloWorldSend;

    @RequestMapping("/send/{context}")
    public String helloWorldSend(@PathVariable String context) {
        return send(context);
    }

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public String send(String context) {
        logger.debug(LocalDateTime.now() + "HelloWorldProducer: " + context);
        this.rabbitTemplate.convertAndSend("helloWorldQueue", context);
        return context;
    }
}
