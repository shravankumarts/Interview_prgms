package com.Inter;

public class ReverseArrayString
{
	public static void main(String[] args) 
	{
		String s="abc cba efg gfe";
		System.out.println("Before reversing the string");
		for(int i=0; i<=s.length()-1;i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println("");
		
		String[] sp=s.split("\\s ");
		System.out.println("After reversing the string each word");
		for(String w:sp)
        {  
        	//System.out.println(w);  
        	for(int i=w.length()-1;i>=0;i--)
        	{
        		System.out.print(w.charAt(i));
        		
        	}
        	System.out.print(" ");
        	
        }
	}
}
