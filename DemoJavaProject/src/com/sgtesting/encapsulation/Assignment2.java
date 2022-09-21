package com.sgtesting.encapsulation;

class Laptop
{
	String Name;
	int price;
}
class Desktop
{
	String Name;
	int price;
}
class Mobile
{
	String Name;
	int price;
}
public class Assignment2 {

	public static void main(String[] args) {
		Laptop obj1=new Laptop();
		obj1.Name="Dell";
		obj1.price=1000;
		System.out.println("Name:"+obj1.Name);
		System.out.println("price:"+obj1.price);
		System.out.println("++++++++++++++++++++++++");
		
		Desktop obj2=new Desktop();
		obj2.Name="HP";
		obj2.price=3000;
	    System.out.println("Name:"+obj2.Name);
	    System.out.println("Price:"+obj2.price);
	    System.out.println("+++++++++++++++++++++++");
	    
	    Mobile obj3=new Mobile();
	    obj3.Name="MotoG5+";
	    obj3.price=10000;
	    System.out.println("Name:"+obj3.Name);
	    System.out.println("Price:"+obj3.price);
	}
}
	    
	    
		
