package com.sgtesting.iopackage;

import java.io.File;
import java.io.IOException;

public class Assignment1 {

	public static void main(String[] args) throws IOException 
	{
		createfolder();
	}
	private static void createfolder() 
	{	
		try
		{
		for(int i=0;i<=9;i++)
			{
				File f2=new File("D:\\Demo1\\Sample"+i);
				f2.mkdir();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}

