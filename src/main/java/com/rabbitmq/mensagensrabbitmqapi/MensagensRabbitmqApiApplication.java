package com.rabbitmq.mensagensrabbitmqapi;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MensagensRabbitmqApiApplication {

	@Value("${queue.order.name}")
	private String nameQueue;

	public static void main(String[] args) {
		SpringApplication.run(MensagensRabbitmqApiApplication.class, args);
	}

	@Bean
	public Queue queue() {
		return new Queue(nameQueue, true);
	}

}
