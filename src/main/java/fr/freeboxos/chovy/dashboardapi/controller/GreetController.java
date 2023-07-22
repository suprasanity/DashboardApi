package fr.freeboxos.chovy.dashboardapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @GetMapping("/hello")
    public String hello() {
        return "t une merde";
    }
}
