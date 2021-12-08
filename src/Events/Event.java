/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Events;

//• The library will also stage a number of events, such as film viewings or book readings1

import User.Admin;
import java.time.LocalDate;

//.
//Each event takes place at a given time (on a specific date), and is managed by an admin
//user. Customers can choose to subscribe to events, within the limits dictated by the event’s
//capacity (e.g. number of seats in the cinema).


/**
 *
 * @author lenovo
 */
public class Event {
    private LocalDate dateOfEvent;
    private String time;
    private Admin admin;
    public Event(String time, Admin admin, String date){
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
}
