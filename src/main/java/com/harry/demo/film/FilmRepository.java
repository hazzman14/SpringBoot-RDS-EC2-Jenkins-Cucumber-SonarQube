package com.harry.demo.film;

import com.harry.demo.actor.Actor;
import com.harry.demo.category.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FilmRepository extends CrudRepository<Film, Long> {
    Optional<Film> findFilmByTitle(String title);
}
