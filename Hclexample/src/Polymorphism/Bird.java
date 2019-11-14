package Polymorphism;

public class Bird {
	
	//instance variables or class variables
	public static int legs=2;
	public static int wings=2;
	public String birdName;
	public StringBuilder birdColour;
	private boolean canSing;
	protected int tails=1;
	
	
	public boolean isCanSing() {
		return canSing;
	}



	public void setCanSing(boolean canSing) {
		this.canSing = canSing;
	}



	public void fly() {
		System.out.println("Start swinging wings");
		System.out.println("Balance body");
		System.out.println("Observe wind direction");
		System.out.println("based on that swing left or right wing");
		
		
	}
	
	
}
