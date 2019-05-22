package com.github.anphycn.routing;


import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Publish/Subscribe 发布/订阅模式
 */
@Configuration
public class MQROConfig {

    //队列
    @Bean
    public Queue ROQueueA() {
        return new Queue("ROQueueA");
    }

    @Bean
    public Queue ROQueueB() {
        return new Queue("ROQueueB");
    }

    @Bean
    public Queue ROQueueC() {
        return new Queue("ROQueueC");
    }



    //主题交换机
    @Bean
    DirectExchange directExchange() {
        return new DirectExchange("directExchange");
    }


    //队列与交换机绑定
    @Bean
    Binding bindingTopicExchangeA(Queue ROQueueA, DirectExchange directExchange) {
        return BindingBuilder.bind(ROQueueA).to(directExchange).with("info");
    }

    @Bean
    Binding bindingTopicExchangeB(Queue ROQueueB, DirectExchange directExchange) {
        return BindingBuilder.bind(ROQueueB).to(directExchange).with("warn");
    }

    @Bean
    Binding bindingTopicExchangeC(Queue ROQueueC, DirectExchange directExchange) {
        return BindingBuilder.bind(ROQueueC).to(directExchange).with("error");
    }
}
