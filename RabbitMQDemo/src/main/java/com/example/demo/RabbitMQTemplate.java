package com.example.demo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class RabbitMQTemplate {
	
	@Autowired
	RabbitTemplate rabbitTemplate;
	
	public void callRabbitMQ(){
		
			System.out.println("hi inside");
		//rabbitTemplate = new RabbitTemplate();
		rabbitTemplate.convertAndSend("my.exchange","","heloo this is deepak");
		
	}

}
