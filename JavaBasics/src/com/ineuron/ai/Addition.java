package com.ineuron.ai;

public class Addition {
	int num1;
	int num2;
	int result;
	 
	public int addTwoNumber(int a, int b)
	{
		
		num1 = a;
		num2 = b;
		result = num1+num2;
		System.out.println(result);
		return result;
		
	}
	

	public static void main(String[] args) 
	{
	
	Addition addition =new Addition();
	addition.addTwoNumber(20, 30);
	

	}

}

