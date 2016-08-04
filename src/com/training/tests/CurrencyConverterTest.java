package com.training.tests;
import com.training.domains.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.training.domains.CurrencyConverter;

public class CurrencyConverterTest {
	
	CurrencyConverter conv;
	
	@Before
	public void init()
	{
		conv = new CurrencyConverter();
	}
	
	
	@Test
	public void testUsdToINR() {
		
				
		double actual = conv.usdToINR(100);
		
		assertEquals(6000.00,actual,0);
		
		
		
	}
	
	
	@Test
	public void testForNegativeValue()
	{
				
		double actual = conv.usdToINR(-100);
		assertEquals(6000.00,actual,0);
	}

}
