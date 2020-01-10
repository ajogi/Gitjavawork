package ExceptionalHandling;

public class Practise6 {
	public static void main(String[] args) {  
        
        try  
        {  
        int data1=50/0; //may throw exception   
  
        }  
             // handling the exception  
        catch(ArithmeticException e)  
        {  
            // generating the exception in catch block  
        int data2=50/0; //may throw exception   
        System.out.println("rest of the code");
        }  
        catch(Exception e)
        {
        	int data3=50/(0+2);
        }
      
    }  
}  