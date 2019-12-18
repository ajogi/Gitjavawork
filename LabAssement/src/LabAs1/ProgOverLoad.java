package LabAs1;

class ProgOverLoadDemo {
	
	    void volume(double radius)
	    {
	    	double c=(4.0/3.0) * 3.14 * (radius * radius * radius);
	         System.out.println("volume of sphere : "+c);
	    }
	    
	}
public class ProgOverLoad
	{
	   public static void main(String args[])
	   {
		   ProgOverLoadDemo obj = new ProgOverLoadDemo();
	       obj.volume(48);
	       obj.volume(35);
	       obj.volume(5.2);
	      
	   }
}
