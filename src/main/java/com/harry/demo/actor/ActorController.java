package com.harry.demo.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


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

    @GetMapping(path="/get/{id}")
    public Optional<Actor> getActorById(@PathVariable("id") Long id) {
        return actorRepository.findById(id);
    }

    @PostMapping(path="/add")
    public @ResponseBody void addActor(@RequestParam String firstName, @RequestParam String lastName){
        Actor a = new Actor(firstName, lastName);
        //check for existing actor here
        actorRepository.save(a);
    }

    @DeleteMapping(path="/delete/{id}")
    public void deleteActorById(@PathVariable("id") Long id){
        actorRepository.deleteById(id);
    }

//    @PutMapping("/modify/{id}")
//    public String modifyActor(@PathVariable("id") Long id, @RequestBody){
//
//    }


}
