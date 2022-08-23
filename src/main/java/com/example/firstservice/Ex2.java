package com.example.firstservice;
import org.springframework.web.bind.annotation.*;
import java.util.Random;
@RestController
public class Ex2 {
    public double random;
    @RequestMapping(value = "/{name}.generate", method = RequestMethod.GET)
    public String generate(@PathVariable("name") String name) {
        Random rand = new Random();
        int num = rand.nextInt(900000000) + 100000000;
        return "Hi, "+name+"<br>"+"Your new password is "+ num;
    }
}
