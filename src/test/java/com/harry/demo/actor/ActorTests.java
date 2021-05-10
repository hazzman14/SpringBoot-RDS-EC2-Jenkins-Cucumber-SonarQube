package com.harry.demo.actor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ActorTests {

    @Test
    void contextLoads() {
    }

    @Test
    void shouldShowSimpleAssertion() {
        Assertions.assertEquals(1, 1);
    }

    @Test
    public void testGetFirstName() {
        Actor actor = new Actor("Harry","Phillips");
        Assertions.assertTrue(actor.getFirstName() == "Harry");
    }

    @Test
    public void testSetFirstName() {
        Actor actor = new Actor();
        actor.setFirstName("Harry");
        Assertions.assertTrue(actor.getFirstName() == "Harry");
    }

    @Test
    public void testGetLastName() {
        Actor actor = new Actor("Harry","Phillips");
        Assertions.assertTrue(actor.getLastName() == "Phillips");
    }

    @Test
    public void testSetLastName() {
        Actor actor = new Actor();
        actor.setLastName("Phillips");
        Assertions.assertTrue(actor.getLastName() == "Phillips");
    }

    @Test
    public void testGetAndSetActorId() {
        Actor actor = new Actor();
        actor.setActor_id(5L);
        Assertions.assertTrue(actor.getActor_id() == 5L);
    }

}




