package com.sgtesting.interfacedemo;
interface sample
{
	void getres(String flowername);
}
interface sample1 extends sample
{
	void getresult(String color);
}
interface sample3 extends sample1
{
	void result(int number);
}
interface sample4 extends sample
{
	void result(String place);
}
class Display implements sample4,sample3
{
	public void getres(String flowername)
	{
		System.out.println("Flowername:"+flowername);
	}
	public void getresult(String color)
	{
		System.out.println("Color:"+color);
	}
	public void result(int num)
	{
		System.out.println("Number:"+num);
	}
	public void result(String place)
	{
		System.out.println("Place:"+ place);
	}
	void res(String address1)
	{
		System.out.println("Address:"+address1);
	}
	
}
public class HybridInterfaceDemo {

	public static void main(String[] args) {
		Display obj=new Display();
		obj.getres("rose");
		obj.getresult("red");
		obj.result(10);
		obj.result("tumkur");
		obj.res("Banglore");
		

	}

}
