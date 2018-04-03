package com.Inter;

import java.util.Scanner;

public class Pallindrome 
{
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in);
		System.out.println("enter a String");
		String an=a.next();

		String b="";
		for(int i=an.length()-1;i>=0;i--)
		{
			b=b+an.charAt(i);
		}
		
		
		if(b.equals(an))
		{
			System.out.println(b+" is pallindrome");
		}
		else
		{
			System.out.println(b+" is not a pallindrome");
		}
	}
	

}
