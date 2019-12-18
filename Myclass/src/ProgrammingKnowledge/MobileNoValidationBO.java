package ProgrammingKnowledge;

public class MobileNoValidationBO {
	public static String validateMobileNo(String mobileNo) {
		StringBuilder s = new StringBuilder(mobileNo);
		if(s.indexOf("+91") == 0 && s.substring(3).length() == 10)
            return "Mobile number valid";
    	return "Mobile number invalid";
	}
}	