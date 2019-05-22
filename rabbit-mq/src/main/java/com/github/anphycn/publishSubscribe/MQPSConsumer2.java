package com.github.anphycn.publishSubscribe;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MQPSConsumer2 {
    protected static Logger logger = LoggerFactory.getLogger(MQPSConsumer2.class);

    @RabbitListener(queues = "PSQueueB")
    @RabbitHandler
    public void helloWorldConsumer(String context) {
        logger.info("PSQueueB【消费者2】: " + context);
    }
}
