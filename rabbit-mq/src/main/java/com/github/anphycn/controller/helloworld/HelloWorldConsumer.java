package com.github.anphycn.controller.helloworld;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "helloWorldQueue")
public class HelloWorldConsumer {
    protected static Logger logger = LoggerFactory.getLogger(HelloWorldConsumer.class);

    @RabbitHandler
    public void process(String hello) {
        logger.debug("HelloReceiver : " + hello);
    }
}
