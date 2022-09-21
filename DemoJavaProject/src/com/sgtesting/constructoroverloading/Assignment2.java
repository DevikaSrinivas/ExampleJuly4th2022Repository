package com.sgtesting.constructoroverloading;

class Laptop
{
	Laptop(String name,int sal)
	{
		System.out.println("Name:"+name);
		System.out.println("Salary:"+sal);
	}
	Laptop(String version)
	{
		System.out.println("Version:"+ version);
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		Laptop obj1=new Laptop("Dell",10000);
		Laptop obj2=new Laptop("windows10");

	}

}
