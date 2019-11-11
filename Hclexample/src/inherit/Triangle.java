package inherit;

public class Triangle extends Shape {
	float base,height,area;
	Triangle()
	{
		System.out.println("constructing Triangle object");
		
	}
	Triangle(float base,float height)
	{
		this.base=base;
		this.height=height;
	}
	public void calcArea()
	{
		area=0.5f*base*height;
		System.out.println("Area of a "+shapeName +" "+ area);
		
	}

}
