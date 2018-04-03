package com.Inter;

public class PalindromeString
{
	public static void main(String[] args)
	{
		String s="madam";
		int n=s.length();
		
		for(int i=0;i<n/2;i++)
		{
			if(!(s.charAt(i) == s.charAt(n-1-i)))
			{
				System.out.println(s+"is not palindrome");
			}
			else
			{
				System.out.println(s+"is palindrome");
			}
		}
		
		
	}
}
