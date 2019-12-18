package ProgrammingKnowledge;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class Main {
	    public static void main(String args[]) throws IOException {
	        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter the mobile number");
	        MobileNoValidationBO mobileNoValidationBO = new MobileNoValidationBO();
	        System.out.println(mobileNoValidationBO.validateMobileNo(buff.readLine()));
	    }
	}

