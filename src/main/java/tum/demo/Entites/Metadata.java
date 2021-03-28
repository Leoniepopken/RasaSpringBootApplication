package tum.demo.entites;

import java.util.HashMap;
import java.util.Map;


public class Metadata {

    private String utter_action;
    private transient Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Metadata() {
    }

    public Metadata(String utter_action, Map<String, Object> additionalProperties) {
        this.utter_action = utter_action;
        this.additionalProperties = additionalProperties;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "utter_action='" + utter_action + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    public String getUtter_action() {
        return utter_action;
    }

    public void setUtter_action(String utter_action) {
        this.utter_action = utter_action;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}
