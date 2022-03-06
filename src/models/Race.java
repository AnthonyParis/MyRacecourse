package models;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Race {

	private String name = "";
	private Date date = getDate();
	private List<String> myHorses = new ArrayList<String>();
	private Horse winner = null;
	
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

		return myRaces;
	}

	public void addHorse(String name) {
		this.myHorses.add(name);
	}
	
	public void start(List<Horse> allHorses) {
		if(this.myHorses.size() == 0 || allHorses.size() == 0) System.out.println("No Horse");
		else {
			List<Horse> competitors = new ArrayList<Horse>();

			System.out.println("Start Race with :");
			
			for(Horse myHorse : allHorses) {
				if(this.myHorses.indexOf(myHorse.getName()) > - 1) {
					competitors.add(myHorse);
					
					System.out.println(myHorse.getName() + " (" + myHorse.getAge() + ")");
				}
			}

			if(competitors.size() == 0) {
				System.out.println("No Competitor !");
				
				return;
			}
			
			this.winner = competitors.get((int) (Math.random() * competitors.size()));
			System.out.println("The Winner is : " + this.winner.getName() + " (" + this.winner.getAge() + ")");
		}
	}
	
	public Horse getWinner() {
		if(this.winner != null) return this.winner;
		else return new Horse("", 0);
	}
}
