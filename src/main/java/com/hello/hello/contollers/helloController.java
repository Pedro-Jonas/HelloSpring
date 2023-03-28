package com.hello.hello.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class helloController {
    @GetMapping("/")
    public String hello () {
        return "Olá spring";
    };
}
