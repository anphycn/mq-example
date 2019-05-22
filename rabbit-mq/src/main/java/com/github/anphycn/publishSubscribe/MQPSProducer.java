package com.github.anphycn.publishSubscribe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MQPSProducer {

    protected static Logger logger= LoggerFactory.getLogger(MQPSProducer.class);

//    @Autowired
//    private HelloWorldSend helloWorldSend;

    @RequestMapping("/ps/send/{context}")
    public String helloWorldSend(@PathVariable String context) {
        return send(context);
    }




    @Autowired
    private AmqpTemplate rabbitTemplate;

    public String send(String context) {
        System.out.println("================================================================================================================================================");
        this.rabbitTemplate.convertAndSend("fanoutExchange","", context);
        logger.info("fanoutExchange【生产者】: " + context);
        return context;
    }
}
