package fr.freeboxos.chovy.dashboardapi.controller;
import org.springframework.web.bind.annotation.RestController;

@RestController("/monitoring")
public class MonitoringController {
//just for testrfq
    public String monitorBd(){
        return "true";
    }
}
