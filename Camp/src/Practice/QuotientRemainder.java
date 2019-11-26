package Practice;

public class QuotientRemainder {

	 public static void main(String args[])
	 {
	       System.out.println("Command line arguments are: "+args[0]+" "+args[1]);
	      int dividend=Integer.parseInt(args[0]);
	      int divisor=Integer.parseInt(args[1]);
	       int quotient = dividend / divisor;
	       int remainder = dividend % divisor;
	       System.out.println("Quotient = " + quotient);
	       System.out.println("Remainder = " + remainder);

	   }
	}