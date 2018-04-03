package com.Inter;

public class OccurenceOfString 
{
	public static void main(String[] args)
	{
		String s="Ctsc CTSC sTSN";
		String str=s.toUpperCase();
		char ch='S';
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			char b=str.charAt(i);
			if(b==ch)
			{
				
	
				count++;
			}
			
			
		}
		System.out.println("no of types repeated the S is ="+count);
	}
}
