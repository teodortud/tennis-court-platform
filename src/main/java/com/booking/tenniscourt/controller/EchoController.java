package com.booking.tenniscourt.controller;

import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
    @GetMapping("/echo")
    public String echoTest(@RequestParam @DefaultValue("test") String echoTest){
        return String.format("This is a %s", echoTest);
    }
}
