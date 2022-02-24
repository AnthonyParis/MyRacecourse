package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Race {

	private String name = "";
	private Date date = getDate();
	
	public Race(String name, Date date) {
		if(!name.isEmpty()) this.name = name;
		
		this.date = date;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public static List<Race> createRace(List<Race> myRaces, String name) {
		myRaces.add(new Race(name, new Date()));
		
		return myRaces;
	}

	public static List<Race> deleteRace(List<Race> myRaces, String name) {
		for(int i = 0; i < myRaces.size(); i ++) {
			if(myRaces.get(i).getName().equals(name)) myRaces.remove(i);
		}
		
		System.out.println(name + " Deleted");

		return myRaces;
	}

}
