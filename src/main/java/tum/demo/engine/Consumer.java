package tum.demo.engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import tum.demo.Entities.RasaEvent;
import tum.demo.services.RasaEventService;


@Service
public class Consumer {

    @Autowired
    public RasaEventService rasaEventService;

    //Für json
    @KafkaListener(topics = "rasa", groupId = "rasa", containerFactory = "userKafkaListenerFactory")
    public void consumeJson(RasaEvent event) {
        System.out.println("Consumed JSON Message: " + event);
        if (event.getMetadata() != null) {
            event.setUtter_action(event.getMetadata().getUtter_action());
        }
        if (event.getData()!=null){
            event.getData().getAdditionalProperties().keySet().forEach(k->{
                System.out.println(k+":"+event.getData().getAdditionalProperties().get(k));
            });
        }
        rasaEventService.saveEvent(event);
    }

}
