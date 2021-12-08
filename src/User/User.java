/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//There should be two types of users: admins and customers. All users should have an ID
//number and a name. In addition, customers should have one library card.
package User;

import java.io.Serializable;

/**
 *
 * @author lenovo
 */
public class User implements Serializable{
    private int idNumber;
    private String name;
    private String password;
    private static int numberOfPeople = 0;
    public User(String name,String password){
        numberOfPeople++;
        this.idNumber = numberOfPeople;
        validName(name);
        this.name = name;
        checkPassword(password);
        this.password = password;
    }
    public User(int idNumber,String name,String password){
        
        this.idNumber = idNumber;
        validName(name);
        this.name = name;
        checkPassword(password);
        this.password = password;
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
        User other = (User) obj;
        return this.name.equals(other.name) && this.idNumber == other.idNumber
                && this.password.equals(other.password);
    }

    public int getIdNumber(){
        return idNumber;
    }
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    @Override
    public String toString(){
        return "Name: "+name+" Id Number: "+idNumber+" Password: "+password;
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
    public static void checkPassword(String password){
        if(password.length() >12){
             throw new IllegalArgumentException( "Password should not be longer than 12");
             
             
        }else if(password.length() == 0){
            throw new IllegalArgumentException( "Password should not be empty");
            
        }
        if(!containDigit(password)){
            throw new IllegalArgumentException( "Password should contain numbers");
        }
        if(!containCharacter(password)){
            throw new IllegalArgumentException( "Password should contain characters");
        }
    }
    public static boolean containDigit(String source) {
        char ch;
        for(int i=0; i<source.length(); i++) {
            ch = source.charAt(i);
            if(ch >= '0' && ch <= '9') {
                return true;
            }
        }      
         
        return false;
    }
     public static boolean containCharacter(String source) {
        char ch;
        for(int i=0; i<source.length(); i++) {
            ch = source.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                return true;
            }
        }      
         
        return false;
    }
//    public static void main(String args[]){
//        User a = new User("David","");
//        System.out.println(a.getIdNumber());
//        
//        
//    }
}
