package com.security.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping("/message")
    public ResponseEntity<String> getMessage(){
        return ResponseEntity.ok("Saluuut merge tot tata!");
    }
}
