package com.sgtesting.String;

public class Assigment6 {

	public static void main(String[] args)
	{
		length();
	}
	private static void length()
	{
		String s="The temple is at the top of the hill";
		String str[]=s.split(" ");
		System.out.println("the number of words in the given string:"+str.length);

	}

}
