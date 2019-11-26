package Practice1;


	import java.util.*;

public class StringCopy {

	private static Scanner numScan;

	public static void main(String[] args) {
	    int numstring=0;

	    numScan = new Scanner(System.in);

	    while (numstring <= 0 ){
	        System.out.print("How many strings? ");
	        numstring = numScan.nextInt();
	        if (numstring<1){
	            System.out.print("Please enter a positive (> 0) number.");
	            }
	        }

	    String[] stringarray = new String[numstring];

	    for (int i = 0; i < numstring; i++) {
	        //ERROR HAPPENING IN THIS CODE BELOW!!!
	        stringarray[i] = inputAlphaString(numScan);
	    }


	    numScan.close();
	}

	public static String inputAlphaString(Scanner aScan) {

	    Scanner strScan = new Scanner(System.in);
	    String t = "a";
	    String hold = "";

	    while(t.matches("[a-zA-Z]+")){
	        System.out.println("Enter an alphabetic string followed by enter: ");
	        t = strScan.nextLine();
	        hold = hold + t;
	    }
	    strScan.close();
	    return hold;

	}

	//added [] into the method name and int to i
	public static void printSArray(String[] sArray) {
	    for (int i = 0; i <= sArray.length; i++)
	            System.out.print(sArray[i] + " ");
	    System.out.println();
	}


}

