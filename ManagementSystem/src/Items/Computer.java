/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

/**
 *
 * @author lenovo
 */
public class Computer extends Item{
    private String comCode;
    private String color;
    private String system;
    public Computer(String idNumber,String comCode,String color,String system ){
        super(idNumber,"Computer");
        validCode(comCode);
        this.comCode = comCode;
        this.color = color;
        this.system = system;
    }
    public Computer(String comCode,String color,String system){
        super("Computer");
        validCode(comCode);
        this.comCode = comCode;
        this.color = color;
        this.system = system;
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
    public String toString(){
        return super.toString()+" Computer Code: "+comCode+" System: "+system+" Color: "+color;
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
