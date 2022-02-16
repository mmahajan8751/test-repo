package com.devmnack.ib.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/root/v1")
public class TestController {

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World from spring boot";
    }
}
