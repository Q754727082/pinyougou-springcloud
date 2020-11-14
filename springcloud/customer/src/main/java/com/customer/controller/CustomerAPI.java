package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerAPI {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String testMethod(){
        return restTemplate.getForObject("http://provider/test2",String.class);
    }
}
