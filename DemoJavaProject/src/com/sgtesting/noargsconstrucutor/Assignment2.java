package com.sgtesting.noargsconstrucutor;

class Laptop
{
	String Name;
	int price;
	Laptop()
	{
		Name="Dell";
		price=1000;
		System.out.println("Name:"+Name);
		System.out.println("price:"+price);
		System.out.println("++++++++++++++++++++++++");
		
	}
}
class Desktop
{
	String Name;
	int price;
	Desktop()
	{
		Name="HP";
		price=3000;
	    System.out.println("Name:"+Name);
	    System.out.println("Price:"+price);
	    System.out.println("+++++++++++++++++++++++");
	}
}
class Mobile
{
	String Name;
	int price;
	Mobile()
	{
		Name="MotoG5+";
	    price=10000;
	    System.out.println("Name:"+Name);
	    System.out.println("Price:"+price);
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		Laptop obj1=new Laptop();
		
		Desktop obj2=new Desktop();
		;
	    
	    Mobile obj3=new Mobile();
	}
}
	    
	    
		
