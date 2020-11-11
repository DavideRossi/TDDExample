package it.unibo.sweng.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAddSingleValue() {
		Calculator calculator = new Calculator();
		assertEquals(10, calculator.add("10"));
	}
	
	@Test
	void testAddListOfThree() {
		Calculator calculator = new Calculator();
		assertEquals(356, calculator.add("1,22,333"));
	}
	
	@Test
	void testAddEmptyString() {
		Calculator calculator = new Calculator();
		assertEquals(-1, calculator.add(""));
	}

	@Test
	void testAddNull() {
		Calculator calculator = new Calculator();
		assertThrows(IllegalArgumentException.class, () -> calculator.add(null));
	}
	
	@Test
	void testAddWrongSeparator() {
		Calculator calculator = new Calculator();
		assertThrows(IllegalArgumentException.class, () -> calculator.add("1,22;333"));
	}
	
	@Test
	void testAddNegativeValue() {
		Calculator calculator = new Calculator();
		assertThrows(IllegalArgumentException.class, () -> calculator.add("1,-22,333"));
	}
	
	@Test
	void testAddNumerTooLarge() {
		Calculator calculator = new Calculator();
		assertThrows(IllegalArgumentException.class, () -> calculator.add("1,2222,333"));
	}
}
