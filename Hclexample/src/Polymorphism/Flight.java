package Polymorphism;

public class Flight extends Bird implements inherit.Automobile{
	private int wheels;
	public String flightNumber;
	private String airLines;
	public int getWheels() {
		return wheels;
	}
	public String getAirLines() {
		return airLines;
	}
	public void setAirLines(String airLines) {
		this.airLines = airLines;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	@Override
	public boolean selfdriven() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public void fly() {

		//we can call super class fly method also by super keyword
		//super.fly();
		System.out.println("flight "+this.flightNumber+" belongs to "+this.airLines+" starting...has "+this.tails+" tail");
		System.out.println("Start first engine");
		System.out.println("drive the flight towards runway");
		System.out.println("once flight reaches the runway,");
		System.out.println("start second engine");
		System.out.println("Take off");
	}

}
