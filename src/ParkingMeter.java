
public class ParkingMeter {

	//a data field that stores the amount of time
	private int timePurchased;
	
	//our constructor for the parking meter that is set with a time
	public ParkingMeter(int time){timePurchased = time;}
	
	//a method that returns the amount of time
	public int getPurchase(){return timePurchased;}
}
