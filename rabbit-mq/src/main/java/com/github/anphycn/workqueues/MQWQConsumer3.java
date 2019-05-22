package com.github.anphycn.workqueues;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MQWQConsumer3 {
    protected static Logger logger = LoggerFactory.getLogger(MQWQConsumer3.class);

    @RabbitListener(queues = "WorkQueues")
    @RabbitHandler
    public void helloWorldConsumer(String context) {
        logger.info("WorkQueues【消费者3】: " + context);
    }
}
