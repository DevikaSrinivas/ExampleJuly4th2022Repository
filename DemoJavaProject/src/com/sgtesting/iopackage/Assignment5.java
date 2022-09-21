package com.sgtesting.iopackage;

import java.io.File;

public class Assignment5 {

	public static void main(String[] args)
	{
		//getfolder();
		//getres();
		//flodernames();
		//imagesfiles();
		filenames();
	}
	private static void getfolder()
	{
		File f1=new File("D:\\Java");
		File f2[]=f1.listFiles();
		for(int i=0;i<f2.length;i++)
		{
			String path=f2[i].getPath();
			if(path.contains("xlsx"))
			{
				System.out.println(path);
			}

		}

	}

	private static void getres()
	{
		File f1=new File("D:\\Java");
		File[] f2=f1.listFiles();
		for(int i=0;i<f2.length;i++)
		{
			String path =f2[i].getPath();
			if(path.contains("txt"))
			{
				System.out.println(path);
			}
		}
	}

	private static void flodernames()
	{
		File f1=new File("D:\\Java");
		File f2[]=f1.listFiles();
		for(int i=0;i<f2.length;i++)
		{
			String path=f2[i].getPath();
			if(path.contains("folder"))
			{
				System.out.println(path);
			}

		}
	}

	private static void imagesfiles()
	{
		File f1=new File("D:\\Java");
		File f2[]=f1.listFiles();
		for(int i=0;i<f2.length;i++)
		{
			String path=f2[i].getPath();
			if(path.contains("JPG"))
			{
				System.out.println(path);
			}
		}
	}
	private static void filenames()
	{
		File f1=new File("D:\\Java");
		File f2[]=f1.listFiles();
		for(File kk:f2)
		{
			System.out.println(kk);
		}
	}

}


