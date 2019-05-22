package com.github.anphycn.topic;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MQTopicConsumer3 {
    protected static Logger logger = LoggerFactory.getLogger(MQTopicConsumer3.class);

    @RabbitListener(queues = "TopicQueueC")
    @RabbitHandler
    public void helloWorldConsumer(String context) {
        logger.info("TopicQueueC【消费者3】: " + context);
    }
}
