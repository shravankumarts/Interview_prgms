package com.Inter;

public class DefaultConstrutorDefault 
{
	
		int id;
		String name;
		 void display()
		{
			System.out.println("student id ="+id);
			System.out.println("Student name= "+name);
		}
	

	public static void main(String[] args) 
	{
		DefaultConstrutorDefault a=new DefaultConstrutorDefault();
		a.display();
		a.display();

	}

}
