package com.sgtesting.practice;
class Fact
{
	int name(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}

public class Factorial {

	public static void main(String[] args) 
	{
		Fact o=new Fact();
		int s=o.name(5);
		System.out.println(s);

	}

}
