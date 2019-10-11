
public class PoliceOfficer {
	
	//our data fields that store the data we want the officer to know
	private String fname;
	private String lname;
	private String badgeNum;
	
	
	//our constructor that creates a policeofficer object
	public PoliceOfficer(String fname, String lname, String badge){this.fname = fname; this.lname = lname; badgeNum = badge;}
	
	//a method that inspects the car and it's meter to see if a ticket is needed, if one is it will calculate the amount and create one
	public void ticketInspect(ParkedCar car){ParkingMeter meter = car.giveMeter();
	//an if statement to test if a car requires a ticket
	if(meter.getPurchase() < car.giveTime())
	{  
		//if a ticket is needed, we calculate how many hours the car has gone over
		int time = car.giveTime() - meter.getPurchase();
		time -= 60;
		int ammount = 30;
		//once we have the amount of hours a car is parked over, then we will convert it into the amount in dollars
		while(time>0) 
				{ammount +=15; time -= 60;}
		//finally we call a method that creates and store a ticket in the car object
		this.giveTicket(ammount,car);}}
	
	//a method that creates a ticket object and has the car store it
	public void giveTicket(int ammount, ParkedCar car)
	{	ParkingTicket ticket = new ParkingTicket(ammount,lname,fname,car.giveMake(),car.giveModel(),car.giveColor(),car.giveLicense());
		car.getTicket(ticket);}
}
