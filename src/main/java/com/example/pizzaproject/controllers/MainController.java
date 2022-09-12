package com.example.pizzaproject.controllers;

import com.example.pizzaproject.services.TestDataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private TestDataLoader testDataLoader;
    @Autowired
    public MainController(TestDataLoader testDataLoader){
        this.testDataLoader = testDataLoader;
    }
    @GetMapping(value = {"/", "/home"})
    public String getHome() {
        return "index";
    }

    @GetMapping(value = {"/test"})
    public String testData (){
        testDataLoader.loadData();
        return "redirect:/";
    }

}
