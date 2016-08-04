package com.training.tests;

import static org.junit.Assert.*;
import com.training.domains.*;
import org.junit.Before;
import org.junit.Test;

import com.training.domains.PrintMaximum;

public class PrintGradesTest {

	PrintGrades grade;
	
	@Before
	public void init()
	{
		grade = new PrintGrades();
	}
	
	
	@Test
	public void testGradeD() {
	String actual = grade.findResult(35);
		
	assertEquals("D",actual);
	}
	
	
	@Test
	public void testGradeC() {
	String actual = grade.findResult(50);
		
	assertEquals("C",actual);
	}
	
	
	@Test
	public void testGradeB() {
	String actual = grade.findResult(90);
		
	assertEquals("B",actual);
	}

}
