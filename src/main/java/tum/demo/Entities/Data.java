package tum.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Entity(name = "Data")
public class Data implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private RasaEvent rasaEvent;
    private transient Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }


    public Data() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RasaEvent getRasaEvent() {
        return rasaEvent;
    }

    public void setRasaEvent(RasaEvent rasaEvent) {
        this.rasaEvent = rasaEvent;
    }
}
