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
			System.out.println("Press 2 for Read all Races");
			System.out.println("Press 3 for Create an Race");
			System.out.println("Press 4 for Delete an Race");
			System.out.print("Your Choice : ");
			char choice = new Scanner(System.in).nextLine().charAt(0);
			
			if(choice == '1') exit = true;
			else if(choice == '2') {
				System.out.println("\nRaces :");
				
				for(Race myRace : this.myRaces) {
					System.out.println(myRace.getName() + " (" + myRace.getDate() + ")");
				}
			} else if(choice == '3') {
				System.out.print("Enter a Name : ");

				String name = new Scanner(System.in).next();
				
				this.myRaces = Race.createRace(this.myRaces, name);

				System.out.println(name + " Added");
			} else if(choice == '4') {
				System.out.print("Enter a Name : ");

				String name = new Scanner(System.in).next();

				this.myRaces = Race.deleteRace(this.myRaces, name);

				System.out.println(name + " Added");
			}
		}
	}

}
