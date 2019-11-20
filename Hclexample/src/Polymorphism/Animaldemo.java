package Polymorphism;

public class Animaldemo {
	public static void main(String args[])
	{
	Lions l=new Lions("yellow",25.25f,11);
	Monkeys m=new Monkeys("brown",32.34f,2);
	Elephants e=new Elephants("ivory",65.56f,32);
	System.out.println(l.color+" Lion weight is "+l.weight+" and it has "+l.age+" years of age");
	System.out.println(m.color+" monkey weight is"+m.weight+" and it has "+m.age+" years of age");
	System.out.println(e.color+" elephant weight is"+e.weight+" and it has "+e.age+" years of age");
	}

}
