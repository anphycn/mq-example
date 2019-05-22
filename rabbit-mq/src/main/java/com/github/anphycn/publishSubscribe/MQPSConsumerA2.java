package com.github.anphycn.publishSubscribe;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MQPSConsumerA2 {
    protected static Logger logger = LoggerFactory.getLogger(MQPSConsumerA2.class);

    @RabbitListener(queues = "PSQueueA")
    @RabbitHandler
    public void helloWorldConsumer(String context) {
        logger.info("PSQueueA【消费者A2】: " + context);
    }
}
