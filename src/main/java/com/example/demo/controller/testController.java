package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping({"/test"})
public class testController {
    @RequestMapping({"/test"})
    @ResponseBody
    public String test() {
        return "Hello world";
    }

    @RequestMapping({"/test_2"})
    @ResponseBody
    public String test_2() {
        System.out.println("....");
        return "test_2";
    }
    
    @RequestMapping({"/test"})
    @ResponseBody
    public String test() {
        return "Hello world";
    }
}
