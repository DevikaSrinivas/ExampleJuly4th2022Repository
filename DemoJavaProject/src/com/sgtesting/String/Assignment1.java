package com.sgtesting.String;

public class Assignment1 {
	public static void main(String[] args)
	{
		charArray();
		substring();
		charAt();
	
	}

	private static  void charArray()
	{
		String rev=" ";
		String s= "javaprogram";
		char ch[]=s.toCharArray();

		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];

		}
		System.out.println("reversed char:"+rev);
		System.out.println("+++++++++++++++++++++++++++");

	}

	private static void substring()
	{
		String s="python";
		int n=6;
		for(int i=4;i>=0;i--)
		{
			System.out.print(s.substring(i, n));
			n--;
		}
		System.out.println();
		System.out.println(s.substring(3, 5));
		System.out.println("+++++++++++++++");

	}
	

	private static void charAt()
	{
		String s="python";
		for(int i=5;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("+++++++++++++++++++++++++");
	}

}


