package com.github.anphycn.routing;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Routing——路由模式
 */
@Configuration
public class MQROConfig {

    //队列
    //即使autoDelete=true，如果队列中有数据，也不会执行自动删除
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
        // 设置队列最大消息数量为5
//        Map<String, Object> args = new HashMap<String, Object>();
//        args.put("x-max-length", 5);
        return new Queue("ROQueueC");
    }


    //路由交换机
    //既使autoDelete=true，如果有绑定的队列存在，也不会执行自动删除
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
