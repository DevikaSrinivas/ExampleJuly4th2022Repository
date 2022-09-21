package com.sgtesting.encapsulation;

class Animals
{
	String AnimalName;
	String Color;
}
class Birds
{
	String BirdName;
	String color;
}
class Insects
{
	String Name;
	String color;
}

public class Assignment4 {

	public static void main(String[] args) {
		Animals obj1=new Animals();
		obj1.AnimalName="bear";
		obj1.Color="black";
		System.out.println("AnimalName:"+ obj1.AnimalName);
		System.out.println("Color:"+ obj1.Color);
		System.out.println("+++++++++++++++++++++++++++++");
		
		Birds obj2=new Birds();
		obj2.BirdName="dove";
		obj2.color="white";
		System.out.println("BirdName:"+ obj2.BirdName);
		System.out.println("color:"+obj2.color);
		System.out.println("++++++++++++++++++++++++++++");
		
		Insects obj3=new Insects();
		obj3.Name="fly";
		obj3.color="Green";
		System.out.println("Name:"+obj3.Name);
		System.out.println("color:"+obj3.color);
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		}
		

	}


