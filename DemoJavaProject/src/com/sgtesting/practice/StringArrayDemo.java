package com.sgtesting.practice;
class Demo1
{
	String[] getStringElements()
	{
		String a[]= {"apple","banana","goa"};
		return a;
	}

}  

public class StringArrayDemo {

	public static void main(String[] args) 
	{
		Demo1 obj=new Demo1();
		String[] kk=obj.getStringElements();
		System.out.println(kk);

	}

}
