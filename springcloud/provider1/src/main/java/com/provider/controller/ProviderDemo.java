package com.provider.controller;

import com.provider.entity.User;
import com.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/provider")
public class ProviderDemo {
    @Value("${server.port}")
    private String sport;

    @RequestMapping("/t")
    public String testMethod(){
        return "test......:"+sport;
    }

    @RequestMapping("/test2")
    public String testMethod2(){
        return "test2......:"+sport;
    }

    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public List<User> userList(){
        return userService.list(null);
    }
}
