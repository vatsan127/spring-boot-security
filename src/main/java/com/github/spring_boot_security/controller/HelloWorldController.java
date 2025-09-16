package com.github.spring_boot_security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/")
    public ResponseEntity<Map<String, Object>> helloWorldMethod() {
        Map<String, Object> response = Map.of("content", "Hello World");
        return ResponseEntity.ok(response);
    }

}
