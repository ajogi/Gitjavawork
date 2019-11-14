package Polymorphism;

public class Flightdemo {

	public static void main(String[] args) {
		
		//creating object for flight class
		Flight f= new Flight();
		
		//set the values to flight class attributes or properties or class instance variable
		f.flightNumber="AI304";
		f.setWheels(16);
		f.setAirLines("Air India");
		//calling methods of flight class
		f.fly();
		


	}

}
