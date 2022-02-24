package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.Racecourse;

class TestRacecourse {

	@Test
	void testRacecourseNameIsSuccess() {
		Racecourse myRacecourse = new Racecourse("My Super Racecourse");
		
		assertNotEquals("", myRacecourse.getName());
	}

	@Test
	void testRacecourseNameIsFailed() {
		Racecourse myRacecourse = new Racecourse("");

		assertEquals("", myRacecourse.getName());
	}

}
