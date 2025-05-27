package com.dockerspring.dockerspringpoc.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "carriers", groupId = "united-group")
    public void listen(String message) {
        System.out.println("Received message from carriers: " + message);
    }

}
