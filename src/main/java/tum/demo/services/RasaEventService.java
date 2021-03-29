package tum.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tum.demo.Entities.RasaEvent;
import tum.demo.repositories.RasaEventRepository;

@Service
public class RasaEventService {

    @Autowired
    private RasaEventRepository rasaEventRepository;

    public void saveEvent(RasaEvent event) {
        rasaEventRepository.save(event);
    }
}
