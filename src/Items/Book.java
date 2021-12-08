/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

import User.Customer;
import java.time.LocalDate;

/**
 *
 * @author lenovo
 */
public class Book extends Item{
    private String author;
    private String bookName;
    private Customer owner;
    private LocalDate borrowDate = LocalDate.parse("1990-10-01");
    private LocalDate returnDate = LocalDate.parse("1990-10-01");
    private boolean available = false;
    public Book(String idNumber,String author,String bookName){
        super(idNumber,"Book");
        validName(author);
        this.author = author;
        this.bookName = bookName;
        borrowDate = LocalDate.parse("1990-10-01");
        returnDate = LocalDate.parse("1990-10-01");
        if(!returnDate.equals(LocalDate.parse("1990-10-01"))){
            available = true;
        }
        owner = new Customer("School","Ok111","owner");
    }
    public Book(String author,String bookName){
        super("Book");
        validName(author);
        this.author = author;
        this.bookName = bookName;
        borrowDate = LocalDate.parse("1990-10-01");
        returnDate = LocalDate.parse("1990-10-01");
        if(!returnDate.equals(LocalDate.parse("1990-10-01"))){
            available = true;
        }
        owner = new Customer("School","Ok111","owner");
    }
    public Book(String author, String bookName,String borrowDate, String returnDate, Customer owner){
        super("Book");
        validName(author);
        this.author = author;
        this.bookName = bookName;
        this.borrowDate = LocalDate.parse(borrowDate);
        this.returnDate = LocalDate.parse(returnDate);
        this.owner = owner;
        if(!returnDate.equals(LocalDate.parse("1990-10-01"))){
            available = true;
        }
       
    }
    public boolean getAvailable(){
        return available;
    }
    public String getAuthor(){
        return author;
    }
    public String getBookName(){
        return bookName;
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
        return super.toString()+" Book Name: "+bookName+" Author: "+author + " Borrow Date: "+borrowDate.toString()+" Return Date: "+returnDate.toString() + " Owner: "+owner.toString();
    }
    
     public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false; //includes null check and getClass() check
        }
        Book other = (Book) obj;
        return author.equals(other.author) && bookName.equals(other.bookName);
    }
      public static void validName(String toCheck) {
        if (toCheck.isEmpty()) {
            throw new IllegalArgumentException( "Name field can't be empty");
        }
        if (!Character.isUpperCase(toCheck.charAt(0))) {
            throw new IllegalArgumentException("Name's initial character should be an upper case letter");
        }
        for (int i=1; i<toCheck.length(); i++) {
            if (!Character.isLowerCase(toCheck.charAt(i))) {
                throw new IllegalArgumentException("Name's characters other than the initial one should be lower case letters");
            }
        }
    }
}
