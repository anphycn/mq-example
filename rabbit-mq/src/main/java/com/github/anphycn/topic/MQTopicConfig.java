package com.github.anphycn.topic;


import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Topics——主题模式
 */
@Configuration
public class MQTopicConfig {

    //队列
    @Bean
    public Queue TopicQueueA() {
        return new Queue("TopicQueueA");
    }

    @Bean
    public Queue TopicQueueB() {
        return new Queue("TopicQueueB");
    }

    @Bean
    public Queue TopicQueueC() {
        return new Queue("TopicQueueC");
    }

    @Bean
    public Queue TopicQueueD() {
        return new Queue("TopicQueueD");
    }



    //主题交换机
    //既使autoDelete=true，如果有绑定的队列存在，也不会执行自动删除
    @Bean
    TopicExchange topicExchange() {
        return new TopicExchange("topicExchange");
    }


    //队列与交换机绑定
    //路由键中特殊匹配字符说明
    //*（星号）可以代替单词（不是一个字符）。
    //＃（散列）可以代替零个或多个单词。
    @Bean
    Binding bindingDirectExchangeA(Queue TopicQueueA, TopicExchange topicExchange) {
        return BindingBuilder.bind(TopicQueueA).to(topicExchange).with("msg");
    }

    @Bean
    Binding bindingDirectExchangeB(Queue TopicQueueB, TopicExchange topicExchange) {
        return BindingBuilder.bind(TopicQueueB).to(topicExchange).with("msg.*");
    }

    @Bean
    Binding bindingDirectExchangeC(Queue TopicQueueC, TopicExchange topicExchange) {
        return BindingBuilder.bind(TopicQueueC).to(topicExchange).with("msg.#");
    }

    @Bean
    Binding bindingDirectExchangeD(Queue TopicQueueD, TopicExchange topicExchange) {
        return BindingBuilder.bind(TopicQueueD).to(topicExchange).with("");
    }
}
