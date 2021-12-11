/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Events;

//• The library will also stage a number of events, such as film viewings or book readings1

import java.io.File;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

//.
//Each event takes place at a given time (on a specific date), and is managed by an admin
//user. Customers can choose to subscribe to events, within the limits dictated by the event’s
//capacity (e.g. number of seats in the cinema).


/**
 *
 * @author lenovo
 */
public class Event implements Serializable{
    public static ArrayList<Event> events;
    private String name;
    private String location;
    private String hoster;
    private int attendNumber;
    private LocalDate time;
    private ArrayList<String> subscribers;

    public Event( String name,
            String location,
            String hoster,
            int attendNumber,
            LocalDate time) {
        this.name = name;
        this.location = location;
        this.hoster = hoster;
        this.attendNumber = attendNumber;
        this.time = time;
        this.subscribers = new ArrayList<>();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) { // null safety
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        return this.toString().equals(((Event) obj).toString());
    }
    public String toString(){
        return "name: "+ this.name +
                " location: " + this.location +
                " hoster: " + this.hoster +
                " attendNumber: "+this.attendNumber +
                " time: "+this.time.toString();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation(){
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHoster() {
        return this.hoster;
    }

    public void setHoster(String hoster) {
        this.hoster = hoster;
    }

    public int getAttendNumber() {
        return this.attendNumber;
    }

    public void setAttendNumber(int attendNumber) {
        this.attendNumber = attendNumber;
    }

    public LocalDate getTime() {
        return this.time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public ArrayList<String> getSubscribers() {
        return this.subscribers;
    }

    public void setSubscribers(ArrayList<String> subscribers) {
        this.subscribers = subscribers;
    }

    public static ArrayList<Event> GetAllEvents() {
        // Todo: Read from the local file 'Events.txt'
        events = new ArrayList<>();
        return events;
    }

    public static void RefreshAllEvents() {
        // Todo: Write the events list to the local file 'Events.txt'
    }

    public static Event GetEvents(String eventName) {
        for (Event event : Event.GetAllEvents()) {
            if (event.getName().equals(eventName)) {
                return event;
            }
        }

        return null;
    }
}
