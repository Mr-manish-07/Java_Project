public class SecondVehicle {
	private String make;
	private String model;
	private int year;
	private String fuelType;
	
	public SecondVehicle (String make, String model, int year, String fuelType) {
		this.make = make;
		this.model = model;
		this.fuelType = fuelType;
		this.year = year;
	}
	
	public int fuelEfficiency (int filledFuel, int distanceTravelled){
		return (filledFuel / distanceTravelled) ;
	}
	
}
