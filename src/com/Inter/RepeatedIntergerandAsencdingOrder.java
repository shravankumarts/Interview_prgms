package com.Inter;

public class RepeatedIntergerandAsencdingOrder
{

	public static void main(String[] args)
	{
		int arr[]={2,5,1,7,4,5,7,1};
		 int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++)
	         {  
	                 for(int j=1; j < (n-i); j++)
	                 {  
	                          if(arr[j-1] > arr[j])
	                          {  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                          
	                 }  
	         }
		System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++)
        {  
                System.out.print(arr[i] + " ");  
        }
        int j=1;
        for(int i=0;i <= arr.length;i++)
        {
        	if(arr[i]==arr[i+1])
            {
        		j++;
            	System.out.println( arr[i]+"is repeated no of times"+j);
            }
        }
        
	}

}
