package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import models.Race;

class TestRace {

	@Test
	void testRaceCreateIsSuccess() {
		Race myRace = new Race("My Super Race", new Date());

		assertNotEquals("", myRace.getName());
	}

	@Test
	void testRaceCreateIsFailed() {
		Race myRace = new Race("", new Date());

		assertEquals("", myRace.getName());
	}
	
}
