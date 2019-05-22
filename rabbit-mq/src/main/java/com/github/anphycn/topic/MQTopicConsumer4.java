package com.github.anphycn.topic;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MQTopicConsumer4 {
    protected static Logger logger = LoggerFactory.getLogger(MQTopicConsumer4.class);

    @RabbitListener(queues = "TopicQueueD")
    @RabbitHandler
    public void helloWorldConsumer(String context) {
        logger.info("TopicQueueD【消费者4】: " + context);
    }
}
