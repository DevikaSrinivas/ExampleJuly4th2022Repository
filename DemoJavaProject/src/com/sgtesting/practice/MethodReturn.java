package com.sgtesting.practice;

class Demo
{
	int Multiplication(int x,int y)
	{
		int res=(x*y);
		return res;
	}
}
public class MethodReturn {
	public static void main(String[] args) 
	{
		Demo o=new Demo();
	    int ss=o.Multiplication(10,20);
	    System.out.println(ss);
	

	}

}
