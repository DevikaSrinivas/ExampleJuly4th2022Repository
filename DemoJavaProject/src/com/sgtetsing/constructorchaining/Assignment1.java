package com.sgtetsing.constructorchaining;

class Players
{
	Players(String Name)
	{
		System.out.println("name:"+Name);
	}
	Players(int number)
	{
		this("santosh");
		System.out.println("Number:"+number);
	}
}
		
public class Assignment1 {

	public static void main(String[] args) {
		Players obj1=new Players(12);
		

	}

}
