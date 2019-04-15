package com.ten;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "gls1")
public class Custom2 {

@RabbitHandler
public void getMessage(String msg){
    System.out.println("gls1:"+msg);

}


}
