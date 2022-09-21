package com.sgtesting.constructoroverloading;

class Fruits
{
	Fruits(String name,int weights)
	{
		System.out.println("Name:"+name);
		System.out.println("Weights:"+weights);
	}
	Fruits(String place)
	{
		System.out.println("Place:"+place);
	}
}
public class Assignment4 {

	public static void main(String[] args) {
		Fruits obj1=new Fruits("apple",1);
		Fruits obj2=new Fruits("tumkur");

	}

}
