package oop;

public class Birddemo {
public static void main(String[] args) {
		
		// create object for class Bird
		Bird p=new Bird();
		
		//set values to attributes
		p.birdColor="Green";
		p.birdName="Parrot";
		/*p.legs=2;
		p.wings=2;*/
		
		//call walk method
		p.walk();
		p.setsingingStatus();
		p.sing();
		
		//call fly method
		p.fly();
		
		Bird k=new Bird();
		k.birdColor="Black";
		k.birdName="Kokila";
		k.walk();
		k.setsingingStatus();
		k.sing();
		k.fly();
		System.out.println("Object id:"+p.hashCode());
	}


}
