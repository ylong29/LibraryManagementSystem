/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

import static Items.Book.validName;
import User.Customer;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author lenovo
 */
public class Computer extends Item implements Serializable{
    private String comCode;
    private String color;
    private String system;
     private Customer owner;
    private LocalDate borrowDate = LocalDate.parse("1990-10-01");
    private LocalDate returnDate = LocalDate.parse("1990-10-01");
    private boolean available = false;
    public Computer(String idNumber,String comCode,String color,String system ){
        super(idNumber,"Computer");
        validCode(comCode);
        this.comCode = comCode;
        this.color = color;
        this.system = system;
         borrowDate = LocalDate.parse("1990-10-01");
        returnDate = LocalDate.parse("1990-10-01");
        if(!returnDate.equals(LocalDate.parse("1990-10-01"))){
            available = true;
        }
        owner = new Customer("School","Ok111","owner");
    }
    public Computer(String comCode,String color,String system){
        super("Computer");
        validCode(comCode);
        this.comCode = comCode;
        this.color = color;
        this.system = system;
        borrowDate = LocalDate.parse("1990-10-01");
        returnDate = LocalDate.parse("1990-10-01");
        if(!returnDate.equals(LocalDate.parse("1990-10-01"))){
            available = true;
        }
        owner = new Customer("School","Ok111","owner");
    }
     public Computer(String comCode,String color,String system,String borrowDate, String returnDate, Customer owner){
        super("Computer");
        validCode(comCode);
        this.comCode = comCode;
        this.color = color;
        this.system = system;
        this.borrowDate = LocalDate.parse(borrowDate);
        this.returnDate = LocalDate.parse(returnDate);
        this.owner = owner;
        if(!returnDate.equals(LocalDate.parse("1990-10-01"))){
            available = true;
        }
       
    }
    public String getComCode(){
        return comCode;
    }
    public String getColor(){
        return color;
    }
    public String getSystem(){
        return system;
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
        return super.toString()+" Computer Code: "+comCode+" System: "+system+" Color: "+color+" Borrow Date: "+borrowDate.toString()+" Return Date: "+returnDate.toString() + " Owner: "+owner.toString();
    }
     public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false; //includes null check and getClass() check
        }
        Computer other = (Computer) obj;
        return comCode.equals(other.comCode) && system.equals(other.system) && color.equals(other.color);
    }
     public static void validCode(String toCheck) {
        if (toCheck.isEmpty()) {
            throw new IllegalArgumentException( "Computer Code can't be empty");
        }
        if (!Character.isUpperCase(toCheck.charAt(0))) {
            throw new IllegalArgumentException("Computer Code's initial character should be an upper case letter");
        }
        for (int i=1; i<toCheck.length(); i++) {
            if (!Character.isDigit(toCheck.charAt(i))) {
                throw new IllegalArgumentException("Computer Code's characters other than the initial one should be numbers");
            }
        }
    }
    
}
