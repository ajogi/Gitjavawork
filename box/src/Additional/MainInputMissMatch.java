package Additional;


	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class MainInputMissMatch {

	    public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);           
			
			try                                            
			{
			System.out.println("Enter an integer input");   
			int val= sc.nextInt();
			
			System.out.println("Entered value is "+val);
			}
			catch(InputMismatchException e)               
			{
			     System.out.println("java.util.InputMismatchException");
			}
		}

	}
