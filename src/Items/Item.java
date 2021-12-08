/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

//The library should store a number of items for rental. Items can be books, magazines, DVDs,

import User.User;
import java.io.Serializable;
import java.time.LocalDate;

//and you may include other types of items if you wish. Items should have an ID number and
//a title, while specific types of items should have their own specific attributes (e.g. author a
//book’s author).


/**
 *
 * @author lenovo
 */
public class Item implements Serializable{
    private int idNumber;
    private String title;
    private static int numberOfItem = 0;
    private String borrowDate = LocalDate.now().toString();
    private String returnDate = LocalDate.now().toString();
    public Item(String idNumber, String title){
        idNumberCheck(idNumber);
        this.idNumber = Integer.parseInt(idNumber);
        titleCheck(title);
        this.title = title;
    }
    public Item(String title){
        numberOfItem++;
        this.idNumber = numberOfItem;
        this.title = title;
    }
    public int getIdNumber(){
        return this.idNumber;
    }
    public String getTitle(){
        return this.title;
    }
    public static void idNumberCheck(String number){
        if (number.isEmpty()) {
            throw new IllegalArgumentException(number + " Id Number can't be empty");
        }else{
            try{
                int myNumber = Integer.parseInt(number);
            }catch(NumberFormatException ex){
                System.out.println("Invalid input: please input an integer: ");
            }
        }
        
        
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
        Item other = (Item) obj;
        return this.title.equals(other.title);
    }
    @Override
    public String toString(){
        return "This is an Item with Id Number: "+idNumber+" Title: "+title;
    }
    public static void titleCheck(String title){
        for(int i=0; i<title.length();i++){
            if(!Character.isLetter(title.charAt(i))){
                throw new IllegalArgumentException("The title of an item should only contain characters!");
            }
        }
    }
    
}
