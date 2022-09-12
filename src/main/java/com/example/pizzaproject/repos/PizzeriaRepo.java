package com.example.pizzaproject.repos;

import com.example.pizzaproject.models.Pizzeria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzeriaRepo extends CrudRepository<Pizzeria, Long> { /// Megadni melyik tablaval foglalkozzon.

}
