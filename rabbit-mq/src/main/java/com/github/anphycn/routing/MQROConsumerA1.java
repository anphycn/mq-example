package com.github.anphycn.routing;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MQROConsumerA1 {
    protected static Logger logger = LoggerFactory.getLogger(MQROConsumerA1.class);

    @RabbitListener(queues = "ROQueueA")
    @RabbitHandler
    public void helloWorldConsumer(String context) {
        logger.info("ROQueueA【消费者A1】: " + context );
    }
}
