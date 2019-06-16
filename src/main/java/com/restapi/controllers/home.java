package com.restapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
    @GetMapping("/home")
    public String welcome(){
        return "Hello Ameya";
    }

    @GetMapping("/add")
    public int addition()
    {
        return 10+20;
    }
}
