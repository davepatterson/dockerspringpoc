package com.dockerspring.dockerspringpoc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CarrierController {
    
    @GetMapping({"/carriers", "/carriers/"})
    List<String> getAllCarriers() {
        List<String> carriers = new ArrayList<String>();
        carriers.add("United Airlines");
        carriers.add("United Express");
        
        return carriers;
    }
}
