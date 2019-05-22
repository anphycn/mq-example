package com.github.anphycn.publishSubscribe;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Publish/Subscribe 发布/订阅模式
 */
@Configuration
public class MQPSConfig {

    //队列
    @Bean
    public Queue PSQueueA() {
        return new Queue("PSQueueA");
    }

    @Bean
    public Queue PSQueueB() {
        return new Queue("PSQueueB");
    }

    @Bean
    public Queue PSQueueC() {
        return new Queue("PSQueueC");
    }



    //交换机(Exchange)
    //既使autoDelete=true，如果有绑定的队列存在，也不会执行自动删除
    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }


    //队列与交换机绑定
    @Bean
    Binding bindingFanoutExchangeA(Queue PSQueueA, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(PSQueueA).to(fanoutExchange);
    }

    @Bean
    Binding bindingFanoutExchangeB(Queue PSQueueB, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(PSQueueB).to(fanoutExchange);
    }

    @Bean
    Binding bindingFanoutExchangeC(Queue PSQueueC, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(PSQueueC).to(fanoutExchange);
    }
}
