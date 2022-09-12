package com.example.pizzaproject.repos;

import com.example.pizzaproject.models.Pizza;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepo extends CrudRepository<Pizza, Long> {
}
