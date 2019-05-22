//package com.github.anphycn.routing;
//
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MQROConsumer3 {
//    protected static Logger logger = LoggerFactory.getLogger(MQROConsumer3.class);
//
//    @RabbitListener(queues = "ROQueueC")
//    @RabbitHandler
//    public void helloWorldConsumer(String context) {
//        logger.info("ROQueueC【消费者3】: " + context);
//    }
//}
