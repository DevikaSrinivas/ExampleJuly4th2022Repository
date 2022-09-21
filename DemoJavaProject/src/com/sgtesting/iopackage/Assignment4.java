package com.sgtesting.iopackage;

import java.io.File;

public class Assignment4 {

	public static void main(String[] args)
	{
		subfolder();
	}
	private static void subfolder()
	{
		String s[]= {"Sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		try 
		{
			for(int i=0;i<s.length;i++)
			{
				File f1=new File("D:\\Demo\\example1\\"+s[i]);
				f1.mkdir();
			}
		}catch(Exception g)
		{
			System.out.println(g);
		}
	}
}



