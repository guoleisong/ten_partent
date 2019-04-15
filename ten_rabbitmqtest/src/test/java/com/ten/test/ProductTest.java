package com.ten.test;

import com.ten.RabbitmqApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitmqApplication.class)
public class ProductTest {

    @Autowired
     private RabbitTemplate rabbitTemplate;

    @Test
    public void sendMessage1(){
      rabbitTemplate.convertAndSend("gls","直接模式测试");
    }
    @Test
    public void sendMessage2(){
      rabbitTemplate.convertAndSend("yun","","分裂模式测试");
    }

    @Test
    public void sendMessage3(){
        rabbitTemplate.convertAndSend("yuntest","good.abc","主题模式测试");
    }

}
