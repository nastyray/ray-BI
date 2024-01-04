package com.yupi.springbootinit.bizmq;

import org.apache.tomcat.util.net.NioEndpoint;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;
import javax.annotation.Resource;

/**
 * ClassName: MyMessageProducer
 * Package: com.yupi.springbootinit.bizmq
 * Description:
 *
 * @Author lilray
 * @Create 2024/1/4 9:19
 * @Version 1.0
 */
@Component
public class MyMessageProducer {
    @Resource
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String exchange,String routingKey,String message){
        rabbitTemplate.convertAndSend(exchange,routingKey,message);
    }
}
