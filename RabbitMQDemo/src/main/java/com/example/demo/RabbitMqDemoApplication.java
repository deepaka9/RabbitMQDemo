package com.example.demo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages = "com.example.demo")
public class RabbitMqDemoApplication implements CommandLineRunner  {

	
	@Autowired
	RabbitMQTemplate mqTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(RabbitMqDemoApplication.class, args);
		System.out.println("hi this deepak");
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hi calling method");
		mqTemplate.callRabbitMQ();
	}

}
