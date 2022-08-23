package com.example.firstservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    @RequestMapping(value = "/cars", method = RequestMethod.GET)
            private List<Customer> customers() {
                return cars;
            }
}
