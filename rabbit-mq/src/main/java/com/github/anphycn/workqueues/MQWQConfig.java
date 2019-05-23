package com.github.anphycn.workqueues;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Work Queues 工作队列
 */
@Configuration
public class MQWQConfig {

    @Bean
    public Queue WorkQueues() {
        return new Queue("WorkQueues");
    }
}
