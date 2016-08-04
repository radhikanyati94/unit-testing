package com.training.domains;

public class FindPerfectNumber {

	public boolean checkPerfectNumber(int number)
	{
		int temp = 0;
		
		
		if(number>0)
		{
			for(int i=1;i<=(number/2);i++)
			{
				if(number%i==0)
				{
					temp = temp+i;
				}
			}
			
			if(number==temp)
			{
				return true;
			}
			else
				
				return false;
		}
		
		else
		{
			System.out.println("%d is not Perfect Number"+number);
			return false;
		}
	}
	
}
