package com.Inter;

public class ReverseArray 
{
	public static void main(String[] args)
	{
		int a[]={1,2,3,4,5,7,8};
		System.out.println("Before Reverse array");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]);
			System.out.print(",");
			
		}
		System.out.println("");
		System.out.println("After Reversing array");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
			System.out.print(",");
			
			
		}
	}
}
