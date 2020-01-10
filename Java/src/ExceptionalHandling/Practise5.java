package ExceptionalHandling;

public class Practise5 {
	public static void main(String[] args) {  
        int i=50;  
        int j=0;  
        int data;  
        try  
        {  
        data=i/j;
        System.out.println("A="+data);
        //may throw exception   
        }  
            // handling the exception  
        catch(Exception e)  
        {  
             // resolving the exception in catch block  
            System.out.println("B="+i/(j+2));  
        }  
    }  
}  
