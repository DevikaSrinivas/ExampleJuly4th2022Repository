package com.sgtesting.parameterizedconstructor;

class Animals
{
	String AnimalName;
	String Color;
	Animals(String animalname,String color)
	{
		AnimalName=animalname;;
		Color=color;
		System.out.println("AnimalName:"+ AnimalName);
		System.out.println("Color:"+ Color);
		System.out.println("+++++++++++++++++++++++++++++");
		
	}
}
class Birds
{
	String BirdName;
	String color;
	Birds(String birdname,String color)
	{
		BirdName=birdname;
		color=color;
		System.out.println("BirdName:"+ BirdName);
		System.out.println("color:"+color);
		System.out.println("++++++++++++++++++++++++++++");
	}
}
class Insects
{
	String Name;
	String color;
	Insects(String Name,String Color)
	{
		Name=Name;
		color=Color;
		System.out.println("Name:"+Name);
		System.out.println("color:"+color);
		System.out.println("++++++++++++++++++++++++++++++++++");
	}
}

public class Assignment4 {

	public static void main(String[] args) {
		Animals obj1=new Animals("bea","black");
		
		Birds obj2=new Birds("dove","white");
		
		
		Insects obj3=new Insects("fly","Green");
	
		
		}
		

	}


