package com.github.anphycn.topic;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MQTopicConsumer1 {
    protected static Logger logger = LoggerFactory.getLogger(MQTopicConsumer1.class);

    @RabbitListener(queues = "TopicQueueA")
    @RabbitHandler
    public void helloWorldConsumer(String context) {
        logger.info("TopicQueueA【消费者1】: " + context );
    }
}
