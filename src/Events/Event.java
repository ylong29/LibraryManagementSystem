/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Events;

//• The library will also stage a number of events, such as film viewings or book readings1

import Items.Item;
import User.Admin;
import java.io.Serializable;
import java.time.LocalDate;

//.
//Each event takes place at a given time (on a specific date), and is managed by an admin
//user. Customers can choose to subscribe to events, within the limits dictated by the event’s
//capacity (e.g. number of seats in the cinema).


/**
 *
 * @author lenovo
 */
public class Event implements Serializable{
    private String name;
    private LocalDate dateOfEvent;
    private String time;
    private Admin admin;
    public Event(String name,String date,String time,Admin admin){
        this.name = name;
        this.time = time;
        this.admin = admin;
        this.dateOfEvent = LocalDate.parse(date);
    }
   public LocalDate getDate(){
       return dateOfEvent;
   }
   public String getTime(){
       return time;
   }
   public Admin getAdmin(){
       return admin;
   }
   public String getName(){
       return name;
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
        Event other = (Event) obj;
        return this.name.equals(other.name)&&this.dateOfEvent.equals(other.dateOfEvent) && this.time.equals(other.dateOfEvent) && this.admin.equals(other.admin);
    }
    public String toString(){
        return "Name: "+this.name+" Date: "+this.dateOfEvent.toString()+" Time: "+this.time+" Admin: "+this.admin.toString();
    }
}
