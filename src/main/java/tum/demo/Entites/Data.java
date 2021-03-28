package tum.demo.entites;

public class Data {

    private Object elements;
    private Object quick_replies;
    private Object buttons;
    private Object attachment;
    private Object image;
    private Object custom;

    public Data() {
    }

    public Data(Object elements, Object quick_replies, Object buttons, Object attachment, Object image, Object custom) {
        this.elements = elements;
        this.quick_replies = quick_replies;
        this.buttons = buttons;
        this.attachment = attachment;
        this.image = image;
        this.custom = custom;
    }

    @Override
    public String toString() {
        return "Data{" +
                "elements=" + elements +
                ", quick_replies=" + quick_replies +
                ", buttons=" + buttons +
                ", attachment=" + attachment +
                ", image=" + image +
                ", custom=" + custom +
                '}';
    }

    public Object getElements() {
        return elements;
    }

    public void setElements(Object elements) {
        this.elements = elements;
    }

    public Object getQuick_replies() {
        return quick_replies;
    }

    public void setQuick_replies(Object quick_replies) {
        this.quick_replies = quick_replies;
    }

    public Object getButtons() {
        return buttons;
    }

    public void setButtons(Object buttons) {
        this.buttons = buttons;
    }

    public Object getAttachment() {
        return attachment;
    }

    public void setAttachment(Object attachment) {
        this.attachment = attachment;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public Object getCustom() {
        return custom;
    }

    public void setCustom(Object custom) {
        this.custom = custom;
    }
}
