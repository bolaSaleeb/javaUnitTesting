package javaUnitTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

	@Test
	void twoPlusTwoShouldEqual4() {
		SimpleCalculator calculator = new SimpleCalculator();
		
		assertEquals(4,calculator.add(2, 2));
	}
	
	@Test
	void threePlusFiveShouldEqual8() {
		SimpleCalculator calculator = new SimpleCalculator();
		
		assertEquals(8,calculator.add(4, 5));
	}
	
	@Test
	void twoPlusSevenShouldEqual9() {
		SimpleCalculator calculator = new SimpleCalculator();
		
		assertEquals(9,calculator.add(2, 7));
	}
	
	@Test
	void threePlusFourShouldEqual7() {
		SimpleCalculator calculator = new SimpleCalculator();
		
		assertEquals(7,calculator.add(3, 4));
	}

}
