package com.sgtesting.interfacedemo;

interface Name
{
	void displayname(String name);
}

interface Address extends Name
{
	void displayAddress(String address);
	
}

interface Pincode extends Address
{
	void displayPincode(long pincode);
}

class Details implements Pincode
{
	public void displayname(String name)
	{
		System.out.println("Name:"+name);
	}
	
	public void displayAddress(String address)
	{
		System.out.println("Address:"+address);
	}
	
	public void displayPincode(long pincode)
	{
		System.out.println("Pincode:"+pincode);
	}

}
public class MultilevelInterface 
{

	public static void main(String[] args) 
	{
		Details obj=new Details();
		obj.displayname("Devika");
		obj.displayAddress("Tumkur");
		obj.displayPincode(560040);
	}

}
