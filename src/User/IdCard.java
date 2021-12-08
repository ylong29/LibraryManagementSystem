/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



// A library card should also have an ID number. Cards in the system should be numbered 1,
//2, 3, etc. on creation. A single library card can be shared by up to 4 different customers. As
//such, when a new customer is added to the system, they can either be assigned a new card,
//or added to an existing one (if the card’s remaining capacity allows it).

package User;

import static User.User.checkPassword;
import static User.User.validName;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class IdCard implements Serializable{
    private int idNumber;
    private ArrayList<Customer> customerList;
    private static int numberOfCard = 0;
    public IdCard(String name,String password){
        numberOfCard++;
        this.idNumber = numberOfCard;
        customerList = new ArrayList<>(4);
    }
    public int getIdNumber(){
        return idNumber;
    }
    public void addCustomer(Customer a){
        customerList.add(a);
    }
    public void removeCustomer(Customer a){
        customerList.remove(a);
    }
    public void printList(){
        for(Customer a:customerList){
            System.out.println(a);
        }
    }
    public ArrayList<Customer> getCustomerList(){
        return customerList;
    }
}
