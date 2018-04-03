package com.Inter;

public class FibonacciPgm 
{
	public static void main(String[] args) 
	{
	
	int a=0;
	int b=1;
	int c=0;
	while(c<=50)
	{
		 c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
		
	}
}
