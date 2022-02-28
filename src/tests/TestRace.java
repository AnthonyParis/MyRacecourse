package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import models.Horse;
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
	
	@Test
	void testRaceDeleteIsSuccess() {
		List<Race> myRaces = new ArrayList<Race>();
		myRaces.add(new Race("My Super Race A", new Date()));
		myRaces.add(new Race("My Super Race B", new Date()));	
		myRaces.add(new Race("My Super Race C", new Date()));
		
		myRaces = Race.deleteRace(myRaces, "My Super Race A");
		
		assertEquals(2, myRaces.size());
	}

	@Test
	void testRaceDeleteIsFailed() {
		List<Race> myRaces = new ArrayList<Race>();
		myRaces.add(new Race("My Super Race A", new Date()));
		myRaces.add(new Race("My Super Race B", new Date()));	
		myRaces.add(new Race("My Super Race C", new Date()));
		
		myRaces = Race.deleteRace(myRaces, "My Super Race D");
		
		assertEquals(3, myRaces.size());
	}
	
	@Test
	void testRaceStartIsSuccess() {
		List<Horse> myHorses = new ArrayList<Horse>();
		myHorses.add(new Horse("My Super Horse A", 1));
		myHorses.add(new Horse("My Super Horse B", 3));
		myHorses.add(new Horse("My Super Horse C", 5));
		myHorses.add(new Horse("My Super Horse D", 7));
		myHorses.add(new Horse("My Super Horse E", 9));
		
		Race myRace = new Race("My Super Race", new Date());
		myRace.addHorse("My Super Horse B");
		myRace.addHorse("My Super Horse C");
		myRace.addHorse("My Super Horse D");
		myRace.start(myHorses);
		
		assertNotEquals("", myRace.getName());
	}
}
