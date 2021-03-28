package tum.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Entity(name = "Conversation")
public class RasaEvent implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String sender_id;
    private double timestamp;
    private String event;
    private String text;
    private transient Data data;
    private String name;
    private String policy;
    private double confidence;
    private transient Metadata metadata;
    private String action_text;
    private transient Map<String, Object> additionalProperties = new HashMap<String, Object>();


    //Default Constructor
    public RasaEvent() {
    }

    public RasaEvent(String sender_id, double timestamp, String event, String text, Data data, String name, String policy, double confidence, Metadata metadata, String action_text, Map<String, Object> additionalProperties) {
        this.sender_id = sender_id;
        this.timestamp = timestamp;
        this.event = event;
        this.text = text;
        this.data = data;
        this.name = name;
        this.policy = policy;
        this.confidence = confidence;
        this.metadata = metadata;
        this.action_text = action_text;
        this.additionalProperties = additionalProperties;
    }

    @Override
    public String toString() {
        return "RasaEvent{" +
                "sender_id='" + sender_id + '\'' +
                ", timestamp=" + timestamp +
                ", event='" + event + '\'' +
                ", text='" + text + '\'' +
                ", data='" + data + '\'' +
                ", name='" + name + '\'' +
                ", policy='" + policy + '\'' +
                ", confidence=" + confidence +
                ", metadata=" + metadata +
                ", action_text='" + action_text + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    public String getSender_id() {
        return sender_id;
    }

    public void setSender_id(String sender_id) {
        this.sender_id = sender_id;
    }

    public double getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(double timestamp) {
        this.timestamp = timestamp;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public double getConfidence() {
        return confidence;
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getAction_text() {
        return action_text;
    }

    public void setAction_text(String action_text) {
        this.action_text = action_text;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
