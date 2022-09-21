package com.sgtesting.iopackage;

import java.io.File;

public class Assignment2 {

	public static void main(String[] args)
	{
		Nestedfolder();
		
		

	}
	private static void Nestedfolder()
	{
		for(int i=0;i<=0;i++)
		{
			File f1=new File("D:\\sample");
			f1.mkdir();
			for(int j=0;j<=0;j++)
			{
				File f2=new File("D:\\sample\\sampl1");
				f2.mkdir();
				for(int k=0;k<=0;k++)
				{
					File f3=new File("D:\\sample\\sampl1\\sampl2");
					f3.mkdir();
					
				}
				
			}
			
		}

	}
	
}
