package com.training.domains;

public class PrintGrades {

	public String findResult(int mark)
	{
		String grade = "O";
		if(mark<=35)
		{
			grade = "D";
		}
		else if(mark>35&&mark<60)
		{
			grade = "C";
		}
		else
		{
			grade = "B";
		}
		return grade;
	}
	
}
