package com.harry.demo.actor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue
    private Long actor_id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    public Actor() {
    }

    public Actor(String first_name, String last_name) {
        this.firstName = first_name;
        this.lastName = last_name;
    }

    public Long getActor_id() {
        return actor_id;
    }

    public void setActor_id(Long actor_id) {
        this.actor_id = actor_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
