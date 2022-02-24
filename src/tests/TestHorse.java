package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.Horse;

class TestHorse {

	@Test
	void testHorseCreateWithNameIsSuccess() {
		Horse myHorse = new Horse("My Super Horse", 18);
		
		assertNotEquals("", myHorse.getName());
	}

	@Test
	void testHorseCreateWithNameIsFailed() {
		Horse myHorse = new Horse("", 18);
		
		assertEquals("", myHorse.getName());
	}

	@Test
	void testHorseCreateWithAgeIsSuccess() {
		Horse myHorse = new Horse("My Super Horse", 18);
		
		assertNotEquals(0, myHorse.getAge());
	}

	@Test
	void testHorseCreateWithAgeIsFailed() {
		Horse myHorse = new Horse("My Super Horse", 200);
		
		
		assertEquals(0, myHorse.getAge());
	}
	
}
