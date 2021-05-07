package com.harry.demo;

import com.harry.demo.actor.Actor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void shouldShowSimpleAssertion(){
		Assertions.assertEquals(1,1);
	}

	@Test
	public void testSetFirstName(){
		Actor actor = new Actor();
		actor.setFirstName("Harry");
		Assertions.assertTrue(actor.getFirstName() == "Harry");

	}

}
