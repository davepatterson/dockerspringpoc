package com.dockerspring.dockerspringpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class DockerspringpocApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerspringpocApplication.class, args);
	}

}
