package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {


    @GetMapping
    public String getS() {


        return "eorifm4fmro4rfmo4mfo4m5f wemdm3edom3odm ";
    }
}
