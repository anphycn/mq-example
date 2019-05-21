package com.github.anphycn.conf;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldQueueRabbitConfig {

    @Bean
    public Queue HelloWorldQueue() {
        return new Queue("helloWorldQueue");
    }
}
