package com.sgtesting.String;

public class Demo1 {

	public static void main(String[] args) 
	{
		substring1();
	}
	private static void substring1()
	{
		String s="python";
		int n=6;
		for(int i=s.length()-1;i>=5;i++)
		{
			System.out.print(s.substring(4, 6));
			

		} 
	}
}

