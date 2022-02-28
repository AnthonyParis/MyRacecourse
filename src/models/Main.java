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
		
		while(!exit) {
			System.out.println("\nPress 1 for Exit");
			System.out.println("Press 2 for Add Horse to a Race");
			System.out.println("Press 3 for Start a Race");
			System.out.println("Press 4 for See Results");

			System.out.println("Press 5 for Read all Races");
			System.out.println("Press 6 for Create an Race");
			System.out.println("Press 7 for Delete an Race");
			System.out.println("Press 8 for Read all Horses");
			System.out.println("Press 9 for Create an Horse");
			System.out.println("Press A for Delete an Horse");
			System.out.print("Your Choice : ");
			char choice = new Scanner(System.in).nextLine().charAt(0);
			
			if(choice == '1') exit = true;
			else if(choice == '5') {
				System.out.println("\nRaces :");
				
				for(Race myRace : this.myRaces) {
					System.out.println(myRace.getName() + " (" + myRace.getDate() + ")");
				}
			} else if(choice == '6') {
				System.out.print("Enter a Name : ");

				String name = new Scanner(System.in).next();
				
				this.myRaces = Race.createRace(this.myRaces, name);

				System.out.println(name + " Added");
			} else if(choice == '7') {
				System.out.print("Enter a Name : ");

				String name = new Scanner(System.in).next();

				this.myRaces = Race.deleteRace(this.myRaces, name);

				System.out.println(name + " Deleted");
			} else if(choice == '8') {
				System.out.println("\nHorses :");
				
				for(Horse myHorse : this.myHorses) {
					System.out.println(myHorse.getName() + " (" + myHorse.getAge() + ")");
				}
			} else if(choice == '9') {
				System.out.print("Enter a Name : ");

				String name = new Scanner(System.in).next();

				System.out.print("Enter an Age : ");

				int age = new Scanner(System.in).nextInt();
				
				this.myHorses = Horse.createHorse(this.myHorses, name, age);

				System.out.println(name + " Added");
			} else if(choice == 'A') {
				System.out.print("Enter a Name : ");

				String name = new Scanner(System.in).next();

				this.myHorses = Horse.deleteHorse(this.myHorses, name);

				System.out.println(name + " Deleted");
			} 
		}
	}

}
