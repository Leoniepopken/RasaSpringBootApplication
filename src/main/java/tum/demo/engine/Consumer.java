package tum.demo.engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import tum.demo.entites.RasaEvent;
import tum.demo.services.RasaEventService;


@Service
public class Consumer {

    @Autowired
    public RasaEventService rasaEventService;

    //Für json
    @KafkaListener(topics = "rasa", groupId = "rasa", containerFactory = "userKafkaListenerFactory")
    public void consumeJson(RasaEvent event) {
        System.out.println("Consumed JSON Message: " + event);
        rasaEventService.saveEvent(event);
    }

}
