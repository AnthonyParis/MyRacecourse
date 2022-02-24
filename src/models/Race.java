package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Race {

	private String name = "";
	private Date date = getDate();
	private List<Horse> horses = new ArrayList<Horse>();
	
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
	
	public List<Horse> getHorses() {
		return this.horses;
	}
	
}
