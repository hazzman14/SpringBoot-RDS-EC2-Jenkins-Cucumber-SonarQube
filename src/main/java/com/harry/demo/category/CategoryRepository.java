package com.harry.demo.category;

import com.harry.demo.film.Film;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
