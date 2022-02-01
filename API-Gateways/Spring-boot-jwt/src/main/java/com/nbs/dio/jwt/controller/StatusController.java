package com.nbs.dio.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//Api
public class StatusController {

    @RequestMapping("/status")
    public String viewStatus(){
        return "online";
    }
}
