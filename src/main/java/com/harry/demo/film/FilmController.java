package com.harry.demo.film;

import com.harry.demo.actor.Actor;
import com.harry.demo.actor.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/films")
public class FilmController {
    @Autowired
    private FilmRepository filmRepository;

    @GetMapping(path="/all")
    public Iterable<Film> getFilms() {
        return filmRepository.findAll();
    }
}
