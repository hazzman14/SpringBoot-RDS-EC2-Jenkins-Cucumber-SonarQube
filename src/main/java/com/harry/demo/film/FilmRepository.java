package com.harry.demo.film;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FilmRepository extends CrudRepository<Film, Long> {
    Optional<Film> findFilmByTitle(String title);
}
