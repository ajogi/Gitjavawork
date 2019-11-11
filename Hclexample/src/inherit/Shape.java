package inherit;

public abstract class Shape {
	
	public String shapeName;
	public int vertex;
	
	//abstract method
	public abstract void calcArea();
	
	//concrete method
	public void showShape()
	{
		System.out.println("Shape:"+shapeName);
		System.out.println("Number of vertex:"+vertex);
	}

}
