package models;

import java.util.List;

public class Race {

	private String name;
	private String date;
	private List<Horse> horses;
	
	public Race() {
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public List<Horse> getHorses() {
		return this.horses;
	}
	
}
