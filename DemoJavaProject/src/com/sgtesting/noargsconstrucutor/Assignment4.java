package com.sgtesting.noargsconstrucutor;

class Animals
{
	String AnimalName;
	String Color;
	Animals()
	{
		AnimalName="bear";
		Color="black";
		System.out.println("AnimalName:"+ AnimalName);
		System.out.println("Color:"+ Color);
		System.out.println("+++++++++++++++++++++++++++++");
		
	}
}
class Birds
{
	String BirdName;
	String color;
	Birds()
	{
		BirdName="dove";
		color="white";
		System.out.println("BirdName:"+ BirdName);
		System.out.println("color:"+color);
		System.out.println("++++++++++++++++++++++++++++");
	}
}
class Insects
{
	String Name;
	String color;
	Insects()
	{
		Name="fly";
		color="Green";
		System.out.println("Name:"+Name);
		System.out.println("color:"+color);
		System.out.println("++++++++++++++++++++++++++++++++++");
	}
}

public class Assignment4 {

	public static void main(String[] args) {
		Animals obj1=new Animals();
		
		Birds obj2=new Birds();
		
		
		Insects obj3=new Insects();
	
		
		}
		

	}


