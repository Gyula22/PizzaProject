package com.example.pizzaproject.controllers;


import com.example.pizzaproject.models.Pizzeria;
import com.example.pizzaproject.services.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PizzeriaController {

    @Autowired
    private PizzeriaService pizzeriaService;


    @GetMapping(value = {"/pizzerias"})
    public String getAllOizzerias (Model model){

        List<Pizzeria> pizzerias = pizzeriaService.getAllPizzerias();

        model.addAttribute("pizzerias", pizzerias);
        return "pizzeria";
    }

}
