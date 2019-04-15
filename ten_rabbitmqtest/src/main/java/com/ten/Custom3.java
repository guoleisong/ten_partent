package com.ten;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "gls2")
public class Custom3 {

@RabbitHandler
public void getMessage(String msg){
    System.out.println("gls2:"+msg);

}


}
