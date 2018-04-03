package com.Inter;

import java.util.Random;

public class RandomNumber 
{
 public static void main(String[] args)
 {
	 int c;
	 Random d=new Random();
	 for(c=1;c<=3;c++)
	 {
		 System.out.println(d.nextInt(20));
	 }
}
}
