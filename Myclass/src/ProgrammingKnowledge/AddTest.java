package ProgrammingKnowledge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void AddTest() {
		MyJUnitClass junit=new MyJUnitClass();
		int result=junit.add(100, 200);
		assertEquals(300, result);
		
	}

}
