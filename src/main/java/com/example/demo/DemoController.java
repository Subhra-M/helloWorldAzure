package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class DemoController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/hello")
    public String helloWorldAzureP(){
        return "Hello world Azure";
    }

}
