package ProgrammingKnowledge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConCamTest {

	@Test
	void Concattest() {
		MyJUnitClass junit=new MyJUnitClass();
		String result=junit.ConCat("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
