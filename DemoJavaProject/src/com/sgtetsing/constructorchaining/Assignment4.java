package com.sgtetsing.constructorchaining;

class Animals
{
	Animals(String name)
	{
		System.out.println("Name:"+name);
	}
	Animals(int number)
	{
		this("bear");
		System.out.println("Number:"+number);
	}
}
public class Assignment4 {

	public static void main(String[] args) {
		Animals obj=new Animals(2);

	}

}
