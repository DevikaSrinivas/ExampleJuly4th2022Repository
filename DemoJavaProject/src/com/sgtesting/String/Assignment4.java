package com.sgtesting.String;

public class Assignment4 {

	public static void main(String[] args)
	{
		replaceString();
	}
	private static void replaceString()
	{
		String s=new String("Mysore to Banglore");
		String s1[]=s.split(" ");
		String sum="";
		for(int i=s1.length-1;i>=0;i--)
		{
			sum=sum+s1[i]+" ";
		}
		System.out.println(sum);

	}



}


