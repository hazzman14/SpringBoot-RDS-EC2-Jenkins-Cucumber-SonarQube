package com.harry.demo.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//This is the API Layer
@RestController
@RequestMapping(path = "api/actors")
public class ActorController {

    @Autowired
    private ActorRepository actorRepository;

    @GetMapping(path="/all")
    public Iterable<Actor> getActors() {
        return actorRepository.findAll();
    }

}
