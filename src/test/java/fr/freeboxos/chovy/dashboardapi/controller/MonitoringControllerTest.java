package fr.freeboxos.chovy.dashboardapi.controller;

import fr.freeboxos.chovy.dashboardapi.controller.MonitoringController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.jupiter.api.Assertions.assertTrue;
@SpringBootTest
public class MonitoringControllerTest {

    @Autowired
    private MonitoringController monitoringController;



    @Test
    public void testMonitorBd() {
        assertTrue(monitoringController.monitorBd().equals("true"));
    }
}


