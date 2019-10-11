
public class ParkingTicket {
	
	//our data fields that store the data we want the parking ticket to know
	private int fineAmmount;
	private String lname;
	private String fname;
	private String carMake;
	private String carModel;
	private String carColor;
	private String carLicense;
	
	//ticket constructor
	public ParkingTicket(int ammount, String lname, String fname, String make, String model, String color, String license)
	{fineAmmount = ammount; this.lname = lname; this.fname = fname; carMake = make; carModel = model; carColor = color; carLicense = license;}
	
	//a method that returns the officer's last name
	public String giveLname(){return lname;}
	
	//a method that returns the officer's first name
	public String giveFname(){return fname;}
	
	//a method that returns the stored ticket ammount
	public int giveAmmount(){return fineAmmount;}
}
