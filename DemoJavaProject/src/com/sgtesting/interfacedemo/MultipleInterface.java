package com.sgtesting.interfacedemo;

interface student
{
	void getres(String name);
}
interface age
{
	void getres(int age);
}
interface place extends student,age
{
	void getresult(String place);
}
class StudentDemo implements place
{
	public void getres(String name)
	{
		System.out.println("Name:"+name);
	}
	public void getres(int age)
	{
		System.out.println("Age:"+age);
	}
	public void getresult(String place)
	{
		System.out.println("Place:"+place);
	}
	void address(String placename)
	{
		System.out.println("Name:"+placename);
	}
}

public class MultipleInterface {

	public static void main(String[] args) {
		StudentDemo obj=new StudentDemo();
		obj.getres("Priya");
		obj.getres(12);
		obj.getresult("tumkur");
		obj.address("Banglore");
		

	}

}
