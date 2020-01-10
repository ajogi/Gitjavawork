package Inheritance;

class Base1 { 
	//final public void show(){}
      public void show() { 
       System.out.println("Base::show() called"); 
    } 
} 
   
class Derived1 extends Base1 { 
    public void show() { 
       System.out.println("Derived::show() called"); 
    } 
} 
   
class Test1 { 
    public static void main(String[] args) { 
        Base1 b = new Derived1();; 
        b.show(); 
    } 
} 