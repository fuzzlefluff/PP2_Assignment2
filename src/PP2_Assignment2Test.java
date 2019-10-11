
public class PP2_Assignment2Test {

	public static void main(String[] args) {
		// setup our police officer object
		 PoliceOfficer officerCarl = new PoliceOfficer("Carl", "Jamesonberg", "29");
		 
		 //setup the parking meter for the first car
		 ParkingMeter redCarMeter = new ParkingMeter (30);
		 //setup the first car with it's parking meter
		 ParkedCar redCar = new ParkedCar("CarBuildCo","Model1","Red","LATEGUY1",60, redCarMeter);
		 //have the officer check the first car
		 officerCarl.ticketInspect(redCar);
		 //print whatever ticket information the car has (including if it doesn't have a ticket)
		 redCar.printTicket();
		 
		 //setup the parking meter for the second car
		 ParkingMeter blueCarMeter = new ParkingMeter(60);
		 //setup the second car with it's parking meter
		 ParkedCar blueCar = new ParkedCar("BobCarCo","ModelA","Blue","OnTimeMan",15,blueCarMeter);
		 //have the officer check the second car
		 officerCarl.ticketInspect(blueCar);
		 //print whatever ticket information the car has (including if it doesn't have a ticket)
		 blueCar.printTicket();
		 
		 //setup the parking meter for the third car
		 ParkingMeter greenCarMeter = new ParkingMeter(45);
		 //setup the third car with it's parking meter
		 ParkedCar greenCar = new ParkedCar("GenericCars","SuperModel","Green","FashionablyLate",195,greenCarMeter);
		 //have the officer check the third car
		 officerCarl.ticketInspect(greenCar);
		 //print whatever ticket information the third car has (including if it doesn't have a ticket)
		 greenCar.printTicket();

	}

}
