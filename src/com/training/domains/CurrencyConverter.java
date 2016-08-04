package com.training.domains;

public class CurrencyConverter {

	public double usdToINR(double usd)
	{
			double amount = Math.abs(usd); 
			return amount*60.00;
	}
	
}
