package com.Inter;

public class ABC {

	public static void main(String[] args)
	{
		int num=5;
		int acc = 0;
		
		 while (num > 1) {
		        long sum = 0;
		        for (int i = 0; i < num; i++) {
		            sum += i;
		        }
		        sum = sum * 2;
		        //set up values for next loop
		        num--;
		        acc += sum;
		    }
		 System.out.println(acc);
	}

}
