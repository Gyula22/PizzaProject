package com.example.pizzaproject.services;

import com.example.pizzaproject.models.Pizzeria;
import com.example.pizzaproject.repos.PizzeriaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzeriaService {
    private PizzeriaRepo pizzeriaRepo;

    @Autowired
    public PizzeriaService(PizzeriaRepo pizzeriaRepo) {
        this.pizzeriaRepo = pizzeriaRepo;
    }

    public List<Pizzeria> getAllPizzerias(){
        List<Pizzeria> pizzerias = (List<Pizzeria>) pizzeriaRepo.findAll();
        return (List<Pizzeria>) pizzeriaRepo.findAll();
    }
}