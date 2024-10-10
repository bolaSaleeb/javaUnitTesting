package javaUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GraderTest {

	@Test
	void fiftyNineShouldReturnF() {
		Grader grader = new Grader();
		
		assertEquals('F', grader.determineLetterGrade(59));
	}
	
	@Test
	void sixtyEightShouldReturnE() {
		Grader grader = new Grader();
		
		assertEquals('E', grader.determineLetterGrade(68));
	}
	
	@Test
	void seventyEightShouldReturnC() {
		Grader grader = new Grader();
		
		assertEquals('C', grader.determineLetterGrade(78));
	}
	
	@Test
	void eightyEightShouldReturnB() {
		Grader grader = new Grader();
		
		assertEquals('B', grader.determineLetterGrade(88));
	}
	
	@Test
	void nintyEightShouldReturnA() {
		Grader grader = new Grader();
		
		assertEquals('A', grader.determineLetterGrade(98));
	}
	
	@Test
	void negativeOneShouldReturnIllegalArgumentException() {
		Grader grader = new Grader();
		
		assertThrows(IllegalArgumentException.class, 
				()->{
					grader.determineLetterGrade(-1);
				});
	}

}
