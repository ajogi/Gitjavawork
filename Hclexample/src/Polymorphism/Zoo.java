package Polymorphism;
import  Polymorphism.Lions;
import  Polymorphism.Monkeys;
import  Polymorphism.Elephants;
class Zoo {
 public static void main(String args[])
{
Lions l=new Lions("wheatish",25.25f,11);
Monkeys m=new Monkeys("Black",7.5f,12);
Elephants e=new Elephants("Ivory",250.00f,20);

System.out.println(l.color +" Lion weight is " +l.weight +" and it has " +l.age +" years of age ");
System.out.println(m.color +" Monkey weight is " +m.weight +" and it has " +m.age +" years of age ");
System.out.println(e.color +" Elephant weight is " +e.weight +" and it has " +e.age +" years of age ");

 }
}

