
public class CargoShip extends Ship {
	int cargoTonnage;
	public CargoShip(String nom, String year, int tons) {
		super(nom, year);
		cargoTonnage = tons;
		
	}
	public int getCargoTonnage() {
		return cargoTonnage;
	}
	public void setCargoTonnage(int cargoTonnage) {
		this.cargoTonnage = cargoTonnage;
	}
	public String toString(String nom, String yearBuilt){
		return "The ship " + name + " was built in the year " + yearBuilt + " and can haul " + cargoTonnage + 
				" tons of cargo.";
	}
}
