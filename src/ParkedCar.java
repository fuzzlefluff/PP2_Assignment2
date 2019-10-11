
public class ParkedCar {

	//data fields that store the data we want the car to know
	private String make;
	private String model;
	private String color;
	private String licensePlate;
	private int parkedTime;
	private ParkingMeter meter;
	boolean hasticket;
	private ParkingTicket ticket;
	
	//our constructor that makes a Car object
	public ParkedCar(String make, String model, String color, String license, int parked, ParkingMeter meter)
	{this.make = make; this.model = model; this.color = color; licensePlate = license; parkedTime = parked; this.meter = meter; hasticket = false;}
	
	//a method that returns the meter object associated with this car object
	public ParkingMeter giveMeter(){return meter;}
	
	//a method that returns the car time
	public int giveTime(){return parkedTime;}
	
	//a method that returns the make
	public String giveMake(){return make;}
	
	//a method that returns the model
	public String giveModel(){return model;}
	
	//a method that returns the color
	public String giveColor(){return color;}
	
	//a method that returns the licensePlate
	public String giveLicense(){return licensePlate;}
	
	//a method that takes a ticket object, stores it in a data field, and sets the boolean to true
	public void getTicket(ParkingTicket ticket){ hasticket = true; this.ticket = ticket;}
	
	//a method that prints out its ticket information
	public void printTicket(){if(hasticket == false) 
	{System.out.println("The car consisting of: Car make: "+make+" || Car model: "+model+" || Car color: "+color+" || LicensePlate: "+licensePlate+" || has no tickets");}
	else{System.out.println("The car consisting of: Car make: "+make+" || Car model: "+model+" || Car color: "+color+" || LicensePlate: "+licensePlate+" has a ticket from Officer: "+ticket.giveLname()+", "+ticket.giveFname()+" for the ammount of: $"+ticket.giveAmmount());}}
}
