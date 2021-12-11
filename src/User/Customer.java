/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Events.Event;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Customer extends User{
    private ArrayList<Event> events;
    public String identity;
    public Customer(String name,String password,String identity){
        super(name,password);
        this.identity = identity;
    }
    public Customer(int IdNumber,String name,String password,String identity){
        super(IdNumber,name,password);
        this.identity = identity;
    }
    public String getIdentity(){
        return identity;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false; //includes null check and getClass() check
        }
        Customer other = (Customer) obj;
        return identity.equals(other.identity);
    }
    public String toString() {
        return "[This is a customer and "+super.toString()+ " Identity: "+identity+ "]";
    }

    // This list is for the events subscribed by this customer
    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public void subscribeEvent(String eventName) {
        Event event = Event.GetEvents(eventName);
        if (event != null) {
            event.getSubscribers().add(this.identity);
            Event.RefreshAllEvents();
        }
    }

    public void removeEvent(String eventName) {
        Event event = Event.GetEvents(eventName);
        if (event != null && event.getSubscribers().contains(this.identity)) {
            event.getSubscribers().remove(this.identity);
            Event.RefreshAllEvents();
        }
    }
}
