package com.usa.G22.reto3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/get")
    public String getSkate(){
        return "Working";
    }
}
