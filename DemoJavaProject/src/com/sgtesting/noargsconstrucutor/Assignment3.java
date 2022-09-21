package com.sgtesting.noargsconstrucutor;

class TwoWheelers
{
	String Bike;
	int price;
	TwoWheelers()
	{
		Bike="Honda";
		price=1000;
		System.out.println("Bike:"+ Bike);
		System.out.println("price:"+price);
		System.out.println("++++++++++++++++++++++");
	}
}
class FourWheelers
{
	String CarName;
	int price;
	FourWheelers()
	{
		CarName="toyota";
		price=1500;
		System.out.println("CarName:"+CarName);
		System.out.println("price:"+price);
		System.out.println("+++++++++++++++++++++++");
	}
}
class HeavyVechicle
{
	String Name;
	int Price;
	HeavyVechicle()
	{
		Name="JCB";
		Price=1000;
		System.out.println("Name:"+Name);
		System.out.println("price:"+Price);
		System.out.println("+++++++++++++++++++++++++++");
	}

}

public class Assignment3 {

	public static void main(String[] args) {
		TwoWheelers obj1=new TwoWheelers();
		
				
		FourWheelers obj2=new FourWheelers();
	
		
		HeavyVechicle obj3=new HeavyVechicle();
		
	}
}


