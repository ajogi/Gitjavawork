package Polymorphism;

public class Monkeys {
	public String color;
	public float weight;
	public int age;
	public Monkeys()
	{
	}
	public Monkeys(String color,float weight,int age)
	{
	this.color=color;
	this.weight=weight;
	this.age=age;
	}
	public boolean isVegetarian()
	{
	return true;
	}
	public boolean canClimb()
	{
	return true;
	}
	public void getSound()
	{
	System.out.println("barks");
	}
}
