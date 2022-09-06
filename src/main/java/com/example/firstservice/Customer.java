package com.example.firstservice;
import org.springframework.web.bind.annotation.*;

@RestController
public class Customer {
    private String ID;
    private String name;
    private boolean sex;
    private int age;
    public Customer(){
        this.ID = " ";
        this.name = "null";
        this.sex = false;
        this.age = 0;
    }
    public Customer(String ID, String n, String s, int a){
        if(s.toLowerCase().equals("male")){
            this.sex = true;
        } else if (s.toLowerCase().equals("female")) {
            this.sex = false;
        }
        this.ID = ID;
        this.name = n;
        if(a < 0){
            this.age = 0;
        }
        else
            this.age = a;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(String sex){
        if(sex.toLowerCase().equals("male")){
            this.sex = true;
        }
        else if (sex.toLowerCase().equals("female")) {
            this.sex = false;
        }
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
