package com.Inter;

public class NumbersFromString 
{

	public static void main(String[] args) 
	{
		String s="am 123 person 5 worked at 9 pm";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(!(ch >='0' && ch<='9'))
			{
				System.out.print(ch);
			}
		}

	}

}
