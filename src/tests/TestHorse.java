package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import models.Horse;
import models.Race;

class TestHorse {

	@Test
	void testHorseCreateWithNameIsSuccess() {
		Horse myHorse = new Horse("My Super Horse", 15);
		
		assertNotEquals("", myHorse.getName());
	}

	@Test
	void testHorseCreateWithNameIsFailed() {
		Horse myHorse = new Horse("", 18);
		
		assertEquals("", myHorse.getName());
	}

	@Test
	void testHorseCreateWithAgeIsSuccess() {
		Horse myHorse = new Horse("My Super Horse", 5);
		
		assertNotEquals(0, myHorse.getAge());
	}

	@Test
	void testHorseCreateWithAgeIsFailed() {
		Horse myHorse = new Horse("My Super Horse", 200);
		
		
		assertEquals(0, myHorse.getAge());
	}

	@Test
	void testHorseDeleteIsSuccess() {
		List<Horse> myHorses = new ArrayList<Horse>();
		myHorses.add(new Horse("My Super Horse A", 3));
		myHorses.add(new Horse("My Super Horse B", 5));	
		myHorses.add(new Horse("My Super Horse C", 7));
		
		myHorses = Horse.deleteHorse(myHorses, "My Super Horse A");
		
		assertEquals(2, myHorses.size());
	}

	@Test
	void testHorseDeleteIsFailed() {
		List<Horse> myHorses = new ArrayList<Horse>();
		myHorses.add(new Horse("My Super Horse A", 3));
		myHorses.add(new Horse("My Super Horse B", 5));	
		myHorses.add(new Horse("My Super Horse C", 7));
		
		myHorses = Horse.deleteHorse(myHorses, "My Super Horse D");
		
		assertEquals(3, myHorses.size());
	}
}
