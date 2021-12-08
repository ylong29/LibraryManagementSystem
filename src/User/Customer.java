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
public class Customer extends User{
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
}
