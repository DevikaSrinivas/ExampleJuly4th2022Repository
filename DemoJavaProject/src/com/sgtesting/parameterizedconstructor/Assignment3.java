package com.sgtesting.parameterizedconstructor;

class TwoWheelers
{
	String Bike;
	int price;
	TwoWheelers(String bike,int Price)
	{
		Bike=bike;
		price=Price;
		System.out.println("Bike:"+ Bike);
		System.out.println("price:"+price);
		System.out.println("++++++++++++++++++++++");
	}
}
class FourWheelers
{
	String CarName;
	int price;
	FourWheelers(String carname,int Price)
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
	HeavyVechicle(String name,int price)
	{
		Name=name;
		Price=price;
		System.out.println("Name:"+Name);
		System.out.println("price:"+Price);
		System.out.println("+++++++++++++++++++++++++++");
	}

}

public class Assignment3 {

	public static void main(String[] args) {
		TwoWheelers obj1=new TwoWheelers("honda",10000);
		
				
		FourWheelers obj2=new FourWheelers("tayota",1000);
	
		
		HeavyVechicle obj3=new HeavyVechicle("JCB",1000);
		
	}
}


