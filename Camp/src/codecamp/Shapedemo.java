package codecamp;

import java.util.Scanner;


abstract class Shape
{
abstract void getPerimeter(float value);

abstract void getArea(float value);
}


class Square extends Shape
 {
	
	@Override
	void getPerimeter(float side) 
	{
		
		float Perimeter=2*side;
		System.out.println("Perimeter of the Square "+Perimeter);	
	}

	@Override
	void  getArea(float side) 
	{		
		float area=side*side;
		System.out.println("Area of the Square "+area);
	}
}
 
 
class Pentagon extends Shape
 {

	@Override
	void getPerimeter(float side) 
	{

		
	}

	@Override
	void getArea(float side) 
	{
	double area=(Math.sqrt(5*(5+2 * Math.sqrt(5)))* side * side)/4;	
	System.out.println("Area of the pentagon "+area);
	}
	 
 }
 
 
 class Circle extends Shape
 {
	 private static final float PI = (float) 3.14;
	
	 float radius;
	
	@Override
	void getPerimeter(float radius) 
	{
		float perimeter= 2*PI*radius;
		System.out.println("Perimeter of the circle "+perimeter);
	}

	@Override
	void getArea(float radius) 
	{
	float area=PI*radius*radius;
	System.out.println("Area of circle "+area);
	
	}
	 } 
 
 
 public class Shapedemo
 {
	 private static final float PI = (float) 3.14;
 public static void main(String[] args)
 {
	
	Scanner sc=new Scanner(System.in);
	Shape s=new Circle();
	Square sq=new Square();
	Pentagon p=new Pentagon();
	
	System.out.println("Enter radius of the circle");
	float radius=sc.nextFloat();
	s.getPerimeter(radius);
	s.getArea(radius);
	
	System.out.println("Enter side of the square ");
	float side=sc.nextFloat();
	sq.getArea(side);
	sq.getPerimeter(side);
	
	System.out.println("Enter side of the pentagon");
	float side1=sc.nextFloat();
	p.getArea(side1);
	p.getPerimeter(side1);
 }
 }