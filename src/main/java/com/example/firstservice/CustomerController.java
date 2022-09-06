package com.example.firstservice;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    private List<Customer> customers;

    public CustomerController(){
        this.customers = new ArrayList<>();
        this.customers.add(new Customer("1010", "John", "Male", 25));
        this.customers.add(new Customer("1018", "Peter", "Male", 24));
        this.customers.add(new Customer("1019", "Sara", "Female", 23));
        this.customers.add(new Customer("1110", "Rose", "Female", 23));
        this.customers.add(new Customer("1001", "Emma", "Female", 30));
    }

    @RequestMapping(value="/customers")
    public List<Customer> getCustomers(){
        return this.customers;
    }
    @RequestMapping(value = "/customerbyid/{id}")
    public Customer getCustomerByID (@PathVariable("id") String ID){
        for(int i=0;i<this.customers.size();i++){
            if(this.customers.get(i).getID().equals(ID)){
                return this.customers.get(i);
            }
        }
        return null;
    }
    @RequestMapping(value = "/customerbyname/{name}")
    public Customer getCustomerByName (@PathVariable("name") String n){
        for(int i=0;i<this.customers.size();i++){
            if(this.customers.get(i).getName().equals(n)){
                return this.customers.get(i);
            }
        }
        return null;
    }
    @DeleteMapping(value="/customerDelByid/{id}")
    public boolean delCustomerByID (@PathVariable("id") String ID){
        for(int i=0;i<this.customers.size();i++){
            if(this.customers.get(i).getID().equals(ID)){
                this.customers.remove(i);
                return true;
            }
        }
        return false;
    }
    @DeleteMapping(value = "/customerDelByname/{n}")
    public boolean delCustomerByName(@PathVariable("n") String n){
        for(int i=0;i<this.customers.size();i++){
            if(this.customers.get(i).getName().equals(n)){
                this.customers.remove(i);
                return true;
            }
        }
        return false;
    }
    @RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
    public boolean addCustomer(@RequestParam("id") String ID,
                               @RequestParam("name") String n,
                               @RequestParam("sex") String s,
                               @RequestParam("age") int a){
        this.customers.add(new Customer(ID,n,s,a));
        return true;
    }
}