package com.Inter;

import java.util.Scanner;

public class Sumofnumbers 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int number=sc.nextInt();
		int sum=0;
		for(int i=0;i<=number;i++)
		{
			sum=sum+i;
			
		}
		
		System.out.println("summ of given number"+sum);

	}

}
