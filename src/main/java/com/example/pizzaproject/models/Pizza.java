package com.example.pizzaproject.models;

import javax.persistence.*;

@Entity
public class Pizza {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    private double price;
    private String toppings;
    @Enumerated(EnumType.STRING)
    private PizzaSize pizzaSize;

    @ManyToOne
    private Pizzeria pizzeria;

    public Pizza (){}

    public Pizza(String name, Pizzeria pizzeria, double price, String toppings, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzeria = pizzeria;
        this.price = price;
        this.toppings = toppings;
        this.pizzaSize = pizzaSize;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pizzeria getPizzeria() {
        return pizzeria;
    }

    public void setPizzeriaId(Pizzeria pizzeria) {
        this.pizzeria = pizzeria;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public Pizza(String name, double price, String toppings, PizzaSize pizzaSize) {
        this.name = name;
        this.price = price;
        this.toppings = toppings;
        this.pizzaSize = pizzaSize;
    }
}
