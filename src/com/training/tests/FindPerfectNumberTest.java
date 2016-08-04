package com.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.training.domains.*;

public class FindPerfectNumberTest {

 FindPerfectNumber num;
	
	@Before
	public void init()
	{
		num = new FindPerfectNumber();
	}
	
	@Test
	public void testNotPerfectNumber() {
		boolean actual = num.checkPerfectNumber(35);
		
		assertEquals(false,actual);
	}
	
	@Test
	public void testPerfectNumber() {
		boolean actual = num.checkPerfectNumber(28);
		
		assertTrue(actual);
	}
	
	@Test
	public void testInvalidNumber() {
		boolean actual = num.checkPerfectNumber(-35);
		
		assertEquals(false,actual);
	}
	
	@Test
	public void testZero() {
		boolean actual = num.checkPerfectNumber(0);
		
		assertEquals(false,actual);
	}

}
