package com.Inter;

import java.util.Scanner;

public class PalindromeInteger {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
		int b=a;
		int rem,reverse=0;
		while(a>0)
		{
			rem=a%10;
			a=a/10;
			reverse=reverse*10+rem;
			
		}
		if(b==reverse)
		{
			System.out.println("numberis palindrome"+b);
		}
		else
		{
			System.out.println(" number is not palindrome="+b);
		}
			

	}

}
