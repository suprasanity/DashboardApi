package fr.freeboxos.chovy.dashboardapi.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hellol")
public class MonitoringController {

    @GetMapping("/hellpo")
    public String monitorBd(){
        return "true";
    }



}
