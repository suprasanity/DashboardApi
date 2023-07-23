package fr.freeboxos.chovy.dashboardapi.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class MonitoringController {

    @GetMapping("/hello")
    public String monitorBd(){
        return "true";
    }



}
