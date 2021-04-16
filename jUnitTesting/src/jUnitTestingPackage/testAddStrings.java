package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitFunction junitStrings = new jUnitFunction();
		String result = junitStrings.addStrings("shivang","manhas");
		assertEquals("shivangmanhas", result);
	}

}
