package com.sgtesting.parameterizedconstructor;

class Laptop
{
	String Name;
	int price;
	Laptop(String name,int Price)
	{
		Name=name;
		price=Price;
		System.out.println("Name:"+Name);
		System.out.println("price:"+price);
		System.out.println("++++++++++++++++++++++++");
		
	}
}
class Desktop
{
	String Name;
	int price;
	Desktop(String name, int Price)
	{
		Name=name;
		price=Price;
	    System.out.println("Name:"+Name);
	    System.out.println("Price:"+price);
	    System.out.println("+++++++++++++++++++++++");
	}
}
class Mobile
{
	String Name;
	int price;
	Mobile(String name,int Price)
	{
		Name=name;
	    price=Price;
	    System.out.println("Name:"+Name);
	    System.out.println("Price:"+price);
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		Laptop obj1=new Laptop("dell",10000);
		
		Desktop obj2=new Desktop("hp",10000);
		;
	    
	    Mobile obj3=new Mobile("motog4",12900);
	}
}
	    
	    
		
