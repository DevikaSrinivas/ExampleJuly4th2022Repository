package com.sgtetsing.constructorchaining;

class Insurance
{
	Insurance(String Name)
	{
		System.out.println("name:"+Name);
	}
	Insurance(int number)
	{
		this("lic");
		System.out.println("Number:"+number);
	}
}
public class Assignment3 {

	public static void main(String[] args) {
		Insurance obj=new Insurance(1000);

	}

}
