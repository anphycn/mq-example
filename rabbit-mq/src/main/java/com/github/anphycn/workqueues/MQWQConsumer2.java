package com.github.anphycn.workqueues;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MQWQConsumer2 {
    protected static Logger logger = LoggerFactory.getLogger(MQWQConsumer2.class);

    @RabbitListener(queues = "WorkQueues")
    @RabbitHandler
    public void helloWorldConsumer(String context) {
        logger.info("WorkQueues【消费者2】: " + context);
    }
}
