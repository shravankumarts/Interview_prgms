package com.Inter;

import java.util.Scanner;

public class Armstrongnumber 
{
	public static void main(String[] args)
	 
	{
		int r,temp,c=0;
		Scanner a=new Scanner(System.in);
		System.out.println("enter the number");
		int an=a.nextInt();
		temp=an;
		while(an>0)
		{
			r =an % 10;
			System.out.println("r="+r);
			an=an /10;
			System.out.println("an="+an);
			
			c=c+(r*r*r);
			//c=c*10+r;     //palindrome integer
			System.out.println(c);
			
		}
		if(c==temp)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not armstrong number");
		}
	}
}
