package com.harry.demo.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import javax.transaction.Transactional;
import java.util.Optional;


//This is the API Layer
@RestController
@RequestMapping(path = "api/actors")
public class ActorController {

    @Autowired
    private ActorRepository actorRepository;

    @GetMapping(path="/all")
    public Iterable<Actor> getActors() {
        //finds and displays all actors
        return actorRepository.findAll();
    }

    @GetMapping(path="/get/{id}")
    public Optional<Actor> getActorById(@PathVariable("id") Long id) throws Exception {
        //get the actor with that id if it exists
        Optional<Actor> actor = actorRepository.findById(id);
        //if it exists
        if(actor.isPresent()){
            //return it
            return actor ;
        }else{
            //otherwise throw exception
            throw new Exception("No actor with this id");
        }
    }

    @PostMapping(path="/add")
    public @ResponseBody void addActor(@RequestParam String firstName, @RequestParam String lastName) throws Exception {
        //make the new actor
        Actor a = new Actor(firstName, lastName);
        //if there is already an actor with this first and last name
        if(actorRepository.findActorByFirstNameAndLastName(firstName, lastName).isPresent()){
            //throw error
            throw new Exception("Actor with this name already exists");
        }else{
            //otherwise save the actor
            actorRepository.save(a);

        }
    }

    @DeleteMapping(path="/delete/{id}")
    public void deleteActorById(@PathVariable("id") Long id) throws Exception {
        //get the actor with that id
        Optional<Actor> check = getActorById(id);
        //if there is an actor with that id
        if(check.isPresent()){
            //deletes the actor with a specific id
            actorRepository.deleteById(id);
        }else{
            //if there isnt an actor with that id
            throw new Exception("No actor with this id");
        }
    }

    @Transactional
    @PutMapping("/modify/{id}")
    public void modifyActorById(@PathVariable("id") Long id, @RequestParam String firstName, @RequestParam String lastName){
        //gets the actor by id if it exists
        Actor actor = actorRepository.findById(id).orElseThrow(() -> new IllegalStateException("id not found: " + id));
        //change names
        actor.setFirstName(firstName);
        actor.setLastName(lastName);
    }
}
