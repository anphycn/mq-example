package com.github.anphycn.helloworld;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldConsumer {
    protected static Logger logger = LoggerFactory.getLogger(HelloWorldConsumer.class);

    @RabbitListener(queues = "helloWorldQueue")
    @RabbitHandler
    public void helloWorldConsumer(String context) {
        logger.info("helloWorldQueue【消费者】: " + context);
    }
}
