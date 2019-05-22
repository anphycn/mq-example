package com.github.anphycn.topic;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MQTopicConsumer2 {
    protected static Logger logger = LoggerFactory.getLogger(MQTopicConsumer2.class);

    @RabbitListener(queues = "TopicQueueB")
    @RabbitHandler
    public void helloWorldConsumer(String context) {
        logger.info("TopicQueueB【消费者2】: " + context);
    }
}
