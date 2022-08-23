package com.example.firstservice;

import org.springframework.web.bind.annotation.*;

//@RestController
//public class demoService {
//        @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
//        public String helloWorld() {
//            return "Hello World";
//        }
//    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
//    public String test(@PathVariable("name") String name) {
//        return name;
//    }
//    }
@RestController
public class Ex1 {
    @RequestMapping(value = "/add/{num1}/{num2}", method = RequestMethod.GET)
    public String add(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
        return String.valueOf(num1+num2);
    }
    @RequestMapping(value = "/minus/{num1}/{num2}", method = RequestMethod.GET)
    public String minus(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
        return String.valueOf(num1-num2);
    }
    @RequestMapping(value = "/multiply", method = RequestMethod.GET)
    public String multiply(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return String.valueOf(num1*num2);
    }
    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public String divide(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return String.valueOf(num1/num2);
    }
}