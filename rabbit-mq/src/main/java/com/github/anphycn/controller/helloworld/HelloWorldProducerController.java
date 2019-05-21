package com.github.anphycn.controller.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class HelloWorldProducerController {

    protected static Logger logger= LoggerFactory.getLogger(HelloWorldProducerController.class);

    @Autowired
    private HelloWorldSend helloWorldSend;

    @RequestMapping("/send/{context}")
    public String helloWorldSend(@PathVariable String context) {
        return helloWorldSend.send(context);
    }
}
