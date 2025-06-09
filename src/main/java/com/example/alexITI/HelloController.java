package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok( "Hello Spring Boot - new deployment using Railway CodePipeline");
    }

}
