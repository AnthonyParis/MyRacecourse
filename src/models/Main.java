package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private Racecourse myRacecourse;
	private List<Race> myRaces = new ArrayList<Race>();
	private List<Horse> myHorses = new ArrayList<Horse>();
		
	public static void main(String[] args) {
		Main myMain = new Main();
		myMain.start();
	}
	
	public void start() {
		this.myRacecourse = new Racecourse("My Super Racecourse");
		System.out.println("*** Welcome at " + this.myRacecourse.getName() + " !***");

		boolean exit = false;
		
		this.debugSingleRace(); // UNCOMMENT FOR TEST
		this.debugMultipleRace(); // UNCOMMENT FOR TEST
		
		while(!exit) {
			this.showMenu();
			char choice = new Scanner(System.in).nextLine().charAt(0);
			
			if(choice == '1') exit = true;
			else if(choice == '2') {
				String race = this.getRaceName();
				String horse = this.getHorseName();

				for(Race myRace : this.myRaces) {
					if(myRace.getName() == race) myRace.addHorse(horse);
				}
				
				System.out.println(horse + " Added to " + race);
			} else if(choice == '3') {
				String race = this.getRaceName();

				for(Race myRace : this.myRaces) {
					if(myRace.getName().equals(race)) myRace.start(this.myHorses);
				}
			} else if(choice == '4') {
				System.out.println("\nRaces :");
				
				for(Race myRace : this.myRaces) {
					System.out.println(myRace.getName() + " (" + myRace.getDate() + ")");
				}
			} else if(choice == '5') {
				String name = this.getRaceName();
				
				this.myRaces = Race.createRace(this.myRaces, name);

				System.out.println(name + " Added");
			} else if(choice == '6') {
				String name = this.getRaceName();

				this.myRaces = Race.deleteRace(this.myRaces, name);

				System.out.println(name + " Deleted");
			} else if(choice == '7') {
				System.out.println("\nHorses :");
				
				for(Horse myHorse : this.myHorses) {
					System.out.println(myHorse.getName() + " (" + myHorse.getAge() + ")");
				}
			} else if(choice == '8') {
				String name = this.getHorseName();

				int age = this.getAge();
				
				this.myHorses = Horse.createHorse(this.myHorses, name, age);

				System.out.println(name + " Added");
			} else if(choice == '9') {
				String name = this.getHorseName();

				this.myHorses = Horse.deleteHorse(this.myHorses, name);

				System.out.println(name + " Deleted");
			} 
		}
	}
	
	public String getRaceName() {
		System.out.print("Enter a Race's Name : ");

		return new Scanner(System.in).next();
	}

	public String getHorseName() {
		System.out.print("Enter a Horse's Name : ");

		return new Scanner(System.in).next();
	}

	public int getAge() {
		System.out.print("Enter a Horse's Age : ");

		return new Scanner(System.in).nextInt();
	}
	
	public void showMenu() {
		System.out.println("\nPress 1 for Exit");
		System.out.println("Press 2 for Add Horse to a Race");
		System.out.println("Press 3 for Start a Race");
		System.out.println("Press 4 for Read all Races");
		System.out.println("Press 5 for Create an Race");
		System.out.println("Press 6 for Delete an Race");
		System.out.println("Press 7 for Read all Horses");
		System.out.println("Press 8 for Create an Horse");
		System.out.println("Press 9 for Delete an Horse");
		System.out.print("Your Choice : ");
	}
	
	public void debugSingleRace() {
		this.myRaces = Race.createRace(this.myRaces, "YnovBattle");
		this.myHorses = Horse.createHorse(this.myHorses, "Anthony", 4);
		this.myRaces.get(0).addHorse("Anthony");
		this.myHorses = Horse.createHorse(this.myHorses, "Ylane", 5);
		this.myRaces.get(0).addHorse("Ylane");
		this.myHorses = Horse.createHorse(this.myHorses, "Pierre", 6);
		this.myRaces.get(0).addHorse("Pierre");
		this.myHorses = Horse.createHorse(this.myHorses, "Jean", 5);
		this.myRaces.get(0).addHorse("Jean");
		this.myHorses = Horse.createHorse(this.myHorses, "Marc", 8);
		this.myRaces.get(0).addHorse("Marc");
		this.myRaces.get(0).start(this.myHorses);
	}

	public void debugMultipleRace() {
		this.myRaces = Race.createRace(this.myRaces, "YnovBattle");
		this.myHorses = Horse.createHorse(this.myHorses, "Anthony", 4);
		this.myRaces.get(0).addHorse("Anthony");
		this.myHorses = Horse.createHorse(this.myHorses, "Ylane", 5);
		this.myRaces.get(0).addHorse("Ylane");
		this.myHorses = Horse.createHorse(this.myHorses, "Pierre", 6);
		this.myRaces.get(0).addHorse("Pierre");
		this.myHorses = Horse.createHorse(this.myHorses, "Jean", 5);
		this.myRaces.get(0).addHorse("Jean");
		this.myHorses = Horse.createHorse(this.myHorses, "Marc", 8);
		this.myRaces.get(0).addHorse("Marc");

		this.myRaces = Race.createRace(this.myRaces, "LastFight");
		this.myHorses = Horse.createHorse(this.myHorses, "Laura", 4);
		this.myRaces.get(1).addHorse("Laura");
		this.myHorses = Horse.createHorse(this.myHorses, "Louise", 7);
		this.myRaces.get(1).addHorse("Louise");
		this.myHorses = Horse.createHorse(this.myHorses, "Anna", 3);
		this.myRaces.get(1).addHorse("Anna");
		this.myHorses = Horse.createHorse(this.myHorses, "Patricia", 5);
		this.myRaces.get(1).addHorse("Patricia");
		this.myHorses = Horse.createHorse(this.myHorses, "Lola", 6);
		this.myRaces.get(1).addHorse("Lola");

		this.myRaces = Race.createRace(this.myRaces, "FunRace");
		this.myHorses = Horse.createHorse(this.myHorses, "Jose", 6);
		this.myRaces.get(2).addHorse("Jose");
		this.myHorses = Horse.createHorse(this.myHorses, "Coralie", 5);
		this.myRaces.get(2).addHorse("Coralie");
		this.myHorses = Horse.createHorse(this.myHorses, "Nicolas", 8);
		this.myRaces.get(2).addHorse("Nicolas");
		this.myHorses = Horse.createHorse(this.myHorses, "Joelle", 8);
		this.myRaces.get(2).addHorse("Joelle");
		this.myHorses = Horse.createHorse(this.myHorses, "Patrick", 3);
		this.myRaces.get(2).addHorse("Patrick");
		
		this.myRaces.get(0).start(this.myHorses);
		this.myRaces.get(1).start(this.myHorses);
		this.myRaces.get(2).start(this.myHorses);
	}
	
	public Horse getWinner(int index) {
		return this.myRaces.get(index).getWinner();
	}

}
