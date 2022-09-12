package com.example.pizzaproject.services;

import com.example.pizzaproject.models.Pizza;
import com.example.pizzaproject.models.PizzaSize;
import com.example.pizzaproject.models.Pizzeria;
import com.example.pizzaproject.repos.PizzaRepo;
import com.example.pizzaproject.repos.PizzeriaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class TestDataLoader {

    private PizzeriaRepo pizzeriaRepo;
    private PizzaRepo pizzaRepo;

    @Autowired
    public TestDataLoader(PizzeriaRepo pizzeriaRepo, PizzaRepo pizzaRepo) {
        this.pizzeriaRepo = pizzeriaRepo;
        this.pizzaRepo = pizzaRepo;
    }


    public void loadData () {
        Pizzeria p1 = new Pizzeria( "PizzaKalap", "Budapest", 8,20);
        Pizzeria p2 = new Pizzeria( "Don Pipi", "Debrecen", 8,20);
        Pizzeria p3 = new Pizzeria( "Pi-zza", "Debrecen", 8,20);

        Pizza pizza1 = new Pizza("Margherita", p1,19.99,"Sajt, Paradicsom, fuszerek", PizzaSize.LARGE);
        Pizza pizza2 = new Pizza("Sonkas", p1,19.99,"Sajt, Paradicsom, Sonka, fuszerek", PizzaSize.LARGE);
        Pizza pizza3 = new Pizza("Gombas", p2,21.99,"Sajt, Gomba, Paradicsom, Sonka, fuszerek", PizzaSize.LARGE);
        Pizza pizza4 = new Pizza("Hawaii", p2,23.99,"Sajt, Ananasz, Paradicsom, Sonka, fuszerek", PizzaSize.LARGE);
        Pizza pizza5 = new Pizza("Kolbaszos", p3,20.99,"Sajt, Kolbasz, Paradicsom, Sonka, fuszerek", PizzaSize.SMALL);

        /// fontos:

        p1.getPizzas().add(pizza1);
        p1.getPizzas().add(pizza2);
        p2.getPizzas().add(pizza3);
        p2.getPizzas().add(pizza4);
        p3.getPizzas().add(pizza5);

        pizzeriaRepo.saveAll(Arrays.asList(p1, p2, p3));      ///Arrays.asList csinal aa nem iteralhato objektumokbol listat
        pizzaRepo.saveAll(Arrays.asList(pizza1, pizza2, pizza3, pizza4, pizza5));
    }
}
