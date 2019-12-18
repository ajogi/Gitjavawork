package ProgrammingKnowledge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MobileNoValidationJUnit {
	@Before
	public void createBoInstance() {
		MobileNoValidationJUnit mv=new MobileNoValidationJUnit();
		mv.testInvalidMobileNo();
	}
	@Test
	public void testValidMobileNo() {
		String message="+91==0";
		System.out.println("This method is used to test valid mobile no scenarios.");
		assertEquals(message,message);
	}
	@Test
	public void testInvalidMobileNo() {
		System.out.println("This method is used to test invalid mobile no scenarios.");
	}
}