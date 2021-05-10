package com.harry.demo.actor;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ActorRepository extends CrudRepository <Actor, Long>{
    Optional<Actor> findActorByFirstNameAndLastName(String firstName, String lastName);
}
