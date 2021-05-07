package com.harry.demo.category;

import com.harry.demo.actor.Actor;
import com.harry.demo.film.Film;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findCategoryByName(String name);
}
