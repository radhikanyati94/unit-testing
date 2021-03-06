package com.training.tests;

import com.training.domains.*;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestPerfectNumberbyParam {

	private int numbers;

	public TestPerfectNumberbyParam(int numbers) {
		super();
		this.numbers = numbers;
	}
	
	@Test
	public void testPerfectByParam(){
		FindPerfectNumber obj = new FindPerfectNumber();
		
		boolean actual = obj.checkPerfectNumber(numbers);
		assertTrue(numbers+" is not Perfect Number",actual);
	}
	
	@Parameters
	public static Collection<Object> data(){
		Object[] data =new Object[] {6,28,33,44};
		return Arrays.asList(data);
	}
	
}
