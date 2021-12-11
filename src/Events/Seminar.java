package Events;

import java.time.LocalDate;

public class Seminar extends Event{
    private String topic;

    public Seminar(String name, String location, String hoster, int attendNumber, LocalDate time) {
        super(name, location, hoster, attendNumber, time);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String toString(){
        return super.toString() +
                " type: Seminar";
    }
}
