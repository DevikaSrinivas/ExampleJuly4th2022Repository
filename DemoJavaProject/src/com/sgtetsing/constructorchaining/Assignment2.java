package com.sgtetsing.constructorchaining;
class BasicMaths
{
	BasicMaths(String Addiation)
	{
		System.out.println("addiation:"+Addiation);
	}
	BasicMaths(int number)
	{
		this("addiationOperation");
		System.out.println("Number:"+number);
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		BasicMaths obj1=new BasicMaths(12);

	}

}
