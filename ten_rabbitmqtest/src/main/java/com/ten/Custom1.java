package com.ten;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "gls")
public class Custom1 {

    @RabbitHandler
    public void getMessage(String msg) {
        System.out.println("gls:" + msg);

    }


}
