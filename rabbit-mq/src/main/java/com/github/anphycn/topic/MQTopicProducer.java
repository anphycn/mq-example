package com.github.anphycn.topic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MQTopicProducer {

    protected static Logger logger= LoggerFactory.getLogger(MQTopicProducer.class);


    @RequestMapping("/topic/send/{rouingKey}/{context}")
    public String helloWorldSend(@PathVariable String rouingKey,@PathVariable String context) {
        return send(rouingKey,context);
    }


    @Autowired
    private AmqpTemplate rabbitTemplate;

    public String send(String rouingKey, String context) {
        System.out.println("================================================================================================================================================");
        this.rabbitTemplate.convertAndSend("topicExchange",rouingKey, context);
        logger.info("topicExchange【路由键:"+rouingKey+"】【生产者】: " + context);
        return context;
    }
}
