
public class Ship {
	String name;
	String yearBuilt;
	
	
	public Ship(String nom, String year) {
		name = nom;
		yearBuilt= year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	public String toString(String nom, String yearBuilt){
		return "The ship " + name + " was built in the year " + yearBuilt + ".";
	}
		
		
	}
	



