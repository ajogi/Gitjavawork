package inherit;

public class Human extends Species {
public static int legs=2;
public boolean swimmingStatus;
//Human constructor
Human()
{
	swimmingStatus=false;
	System.out.println("Human constructor");
}
//static method
public static void talk()
{
	System.out.println("Can talk");
}
public void walk()
{
	System.out.println("Can walk "+"with "+legs+" legs.");
}
}
