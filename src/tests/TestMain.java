package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.Main;

class TestMain {

	private Main myMain;

	@BeforeEach
	void beforeEach() {
		this.myMain = new Main();
	}
	
	@Test
	void showMenu() {
		this.myMain.showMenu();
		
		assertEquals(true, true);
	}
	
	@Test
	void debugSingleRace() {
		this.myMain.debugSingleRace();
		
		assertNotEquals("", this.myMain.getWinner(0).getName());
	}

	@Test
	void debugMultipleRace() {
		this.myMain.debugMultipleRace();
		
		boolean result = true;
		
		if(this.myMain.getWinner(0).getName() == "") result = false;
		else if(this.myMain.getWinner(1).getName() == "") result = false;
		else if(this.myMain.getWinner(2).getName() == "") result = false;

		assertEquals(true, result);
	}
	
}
