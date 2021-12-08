/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author lenovo
 */
public class Admin extends User{
    public String title;
    public Admin(String name,String password,String title){
        super(name,password);
        this.title = title;
    }
    public Admin(int IdNumber,String name,String password,String title){
        super(IdNumber,name,password);
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false; //includes null check and getClass() check
        }
        Admin other = (Admin) obj;
        return title.equals(other.title);
    }
    public String toString() {
        return "[This is an admin and "+super.toString()+ " Title: "+title+ "]";
    }
    
}
