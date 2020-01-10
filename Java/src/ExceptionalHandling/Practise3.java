package ExceptionalHandling;

public class Practise3 {
	
		  public static void main(String args[]){  
		   try{  
		      //code that may raise exception  
			   String s="abc";  
			   int i=Integer.parseInt(s);//NumberFormatException 
		   }catch(NumberFormatException e){System.out.println(e);}  
		   //rest code of the program   
		   System.out.println("rest of the code...");  
		  }  
		}  
