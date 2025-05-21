package com.ambrose2020.renderapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RenderController {

    @GetMapping("hello")
    public String sayHello(){
        return "Hello from render based springboot app";
    }

}
