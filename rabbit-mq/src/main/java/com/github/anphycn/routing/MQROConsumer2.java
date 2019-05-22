package com.github.anphycn.routing;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MQROConsumer2 {
    protected static Logger logger = LoggerFactory.getLogger(MQROConsumer2.class);

    @RabbitListener(queues = "ROQueueB")
    @RabbitHandler
    public void helloWorldConsumer(String context) {
        logger.info("ROQueueB【消费者2】: " + context);
    }
}
