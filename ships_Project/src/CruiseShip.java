
public class CruiseShip extends Ship {
	int passenger;
	public CruiseShip(String nom, String year, int pass) {
		super(nom, year);
		passenger = pass;
	}
	public int getPassenger() {
		return passenger;
	}
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	public String toString(String nom, String yearBuilt){
		return "The ship " + name + " was built in the year " + yearBuilt + " and carries " + passenger + 
				" passengers.";
	}
		
}
