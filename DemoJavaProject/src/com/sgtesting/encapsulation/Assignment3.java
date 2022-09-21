package com.sgtesting.encapsulation;

class TwoWheelers
{
	String Bike;
	int price;
}
class FourWheelers
{
	String CarName;
	int price;
}
class HeavyVechicle
{
	String Name;
	int Price;
}

public class Assignment3 {

	public static void main(String[] args) {
		TwoWheelers obj1=new TwoWheelers();
		obj1.Bike="Honda";
		obj1.price=1000;
		System.out.println("Bike:"+ obj1.Bike);
		System.out.println("price:"+obj1.price);
		System.out.println("++++++++++++++++++++++");
				
		FourWheelers obj2=new FourWheelers();
		obj2.CarName="toyota";
		obj2.price=1500;
		System.out.println("CarName:"+obj2.CarName);
		System.out.println("price:"+obj2.price);
		System.out.println("+++++++++++++++++++++++");
		
		HeavyVechicle obj3=new HeavyVechicle();
		obj3.Name="JCB";
		obj3.Price=1000;
		System.out.println("Name:"+obj3.Name);
		System.out.println("price:"+obj3.Price);
		System.out.println("+++++++++++++++++++++++++++");
	}
}


