package com.example.pizzaproject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Pizzeria {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String address;
    private int openHour;
    private int closeHour;

    @OneToMany(mappedBy = "pizzeria")
    private List<Pizza> pizzas;

    public Pizzeria() {
        pizzas = new ArrayList<>();
    }

    public Pizzeria(String name, String address, int openHour, int closeHour) {
        this();
        this.name = name;
        this.address = address;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    public Pizzeria(long id, String name, String address, int openHour, int closeHour) {
        this(name, address, openHour, closeHour);
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOpenHour() {
        return openHour;
    }

    public void setOpenHour(int openHour) {
        this.openHour = openHour;
    }

    public int getCloseHour() {
        return closeHour;
    }

    public void setCloseHour(int closeHour) {
        this.closeHour = closeHour;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
}
