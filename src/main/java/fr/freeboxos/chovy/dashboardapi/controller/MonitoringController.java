package fr.freeboxos.chovy.dashboardapi.controller;
import org.springframework.web.bind.annotation.RestController;

@RestController("/monitoring")
public class MonitoringController {

    public String monitorBd(){
        return "je suis unecatin";
    }
}
