package com.yupi.springbootinit.bizmq;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ClassName: MyMessageProducerTest
 * Package: com.yupi.springbootinit.bizmq
 * Description:
 *
 * @Author lilray
 * @Create 2024/1/4 9:51
 * @Version 1.0
 */
@SpringBootTest
class MyMessageProducerTest {

    @Resource
    private MyMessageProducer myMessageProducer;

    @Test
    void sendMessage() {
        myMessageProducer.sendMessage("code_exchange","my_routingKey","你好啊");

    }
}