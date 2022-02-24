package models;

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
	
}
