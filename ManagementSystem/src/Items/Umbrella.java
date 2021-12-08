/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

import static Items.Book.validName;
import User.Customer;
import java.time.LocalDate;

/**
 *
 * @author lenovo
 */
public class Umbrella extends Item{
    public enum Color {RED, YELLOW, GREEN, BLACK,WHITE}
    private String color;
    private String code;
    private Customer owner;
    private LocalDate borrowDate = LocalDate.parse("1990-10-01");
    private LocalDate returnDate = LocalDate.parse("1990-10-01");
    private boolean available = false;
    public Umbrella(String idNumber,String color,String code){
        super(idNumber,"Umbrella");
        this.color = color;
        this.code = code;
         borrowDate = LocalDate.parse("1990-10-01");
        returnDate = LocalDate.parse("1990-10-01");
        if(!returnDate.equals(LocalDate.parse("1990-10-01"))){
            available = true;
        }
        owner = new Customer("School","Ok111","owner");
    }
    public Umbrella(String color,String code){
        super("Umbrella");
        this.color = color;
        this.code = code;
         borrowDate = LocalDate.parse("1990-10-01");
        returnDate = LocalDate.parse("1990-10-01");
        if(!returnDate.equals(LocalDate.parse("1990-10-01"))){
            available = true;
        }
        owner = new Customer("School","Ok111","owner");
    }
    public Umbrella(String color,String code,String borrowDate, String returnDate, Customer owner){
        super("Umbrella");
        this.color = color;
        this.code = code;
        this.borrowDate = LocalDate.parse(borrowDate);
        this.returnDate = LocalDate.parse(returnDate);
        this.owner = owner;
        if(!returnDate.equals(LocalDate.parse("1990-10-01"))){
            available = true;
        }
    }
    public String getColor(){
        return this.color;
    }
    public String getCode(){
        return this.code;
    }
     public String getBorrowDate(){
        return borrowDate.toString();
    }
    public String getReturnDate(){
        return returnDate.toString();
    }
    public Customer getOwner(){
        return owner;
    }
    public String toString(){
        return super.toString()+" Code: "+code+" Color: "+color+ " Borrow Date: "+borrowDate.toString()+" Return Date: "+returnDate.toString() + " Owner: "+owner.toString();
    }
     public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false; //includes null check and getClass() check
        }
        Umbrella other = (Umbrella) obj;
        return color.equals(other.color) && code.equals(other.code);
    }
    
}

