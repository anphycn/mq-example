package com.github.anphycn.publishSubscribe;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MQPSConsumer3 {
    protected static Logger logger = LoggerFactory.getLogger(MQPSConsumer3.class);

    @RabbitListener(queues = "PSQueueC")
    @RabbitHandler
    public void helloWorldConsumer(String context) {
        logger.info("PSQueueC【消费者3】: " + context);
    }
}
