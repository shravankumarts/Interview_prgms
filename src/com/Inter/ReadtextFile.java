package com.Inter;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadtextFile 
{
	public static void main(String[] args) throws Exception
	{
		FileReader fd=new FileReader("C:\\Users\\Orange Anji\\Desktop\\text.txt");
		BufferedReader br=new BufferedReader(fd);
		String line = null;
		String ch="CTSH";
		int count=0;
		while((line = br.readLine()) != null)
		{
            System.out.println(line);
        
            String[] words=line.split("\\s");
            for(String w:words)
            {  
            	//System.out.println(w);  
            	if(ch.equals(w))
            	{
            		count++;
            	}
		}
		
		}
		System.out.println("No of time CTSH repeated ="+count);
	}
}
