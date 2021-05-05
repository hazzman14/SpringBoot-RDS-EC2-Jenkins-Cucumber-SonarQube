package com.harry.demo.film;

import com.harry.demo.actor.Actor;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<Film, Long> {
}
