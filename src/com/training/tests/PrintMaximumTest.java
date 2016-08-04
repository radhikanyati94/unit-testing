package com.training.tests;
import com.training.domains.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrintMaximumTest {

	PrintMaximum max;
	@Before
	public void init()
	{
		max = new PrintMaximum();
	}
	
	@Test
	public void testPrintMaxWithPositiveValues() {
		
		int[] numbers = {12,23,45,67};
		double actual = max.findMaximum(numbers);
		
		assertEquals(67,actual,0);
		
	}
	
	@Test
	public void testPrintMaxWithNegativeValues() {
		
		int[] numbers = {12,23,-45,-67};
		double actual = max.findMaximum(numbers);
		
		assertEquals(23,actual,0);
	}

}
