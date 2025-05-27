package com.dockerspring.dockerspringpoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dockerspring.dockerspringpoc.producer.MessageProducer;

@RestController
public class KafkaController {

    @Autowired
    private MessageProducer messageProducer;

    @GetMapping({"/send", "/send/"})
    public String sendMessage() {
        String message = "A simple test message";
        messageProducer.sendMessage("carriers", message);
        return "Message sent: " + message;
    }

}
