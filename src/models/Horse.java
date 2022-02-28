package models;

import java.util.Date;
import java.util.List;

public class Horse {

	private String name = "";
	private int age = 0;
	private int victories = 0;
	
	public Horse(String name, int age) {
		if(!name.isEmpty()) this.name = name;
		if(age > 0 && age < 100) this.age = age;
		
		this.victories = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getVictories() {
		return this.victories;
	}
	
	public static List<Horse> createHorse(List<Horse> myHorses, String name, int age) {
		myHorses.add(new Horse(name, age));
		
		return myHorses;
	}

	public static List<Horse> deleteHorse(List<Horse> myHorses, String name) {
		for(int i = 0; i < myHorses.size(); i ++) {
			if(myHorses.get(i).getName().equals(name)) myHorses.remove(i);
		}

		return myHorses;
	}
	
}
