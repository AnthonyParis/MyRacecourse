package models;

public class Racecourse {
	
	private String name = "";
	
	public Racecourse(String name) {
		if(!name.isEmpty()) this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
