package tum.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tum.demo.services.RasaEventService;

@Controller
public class KafkaController {

    @Autowired
    private RasaEventService rasaEventService;
}
