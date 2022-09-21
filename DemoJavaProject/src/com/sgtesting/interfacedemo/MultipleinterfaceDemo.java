package com.sgtesting.interfacedemo;
abstract class Sample111
{
	abstract void display(String name);
}
interface sample2
{
	void getres(String place);
}
interface sample31 extends sample2
{
	void res(int age);
}
class Example3 extends Sample111 implements sample2,sample31
{
	public void getres(String place)
	{
		System.out.println("Place:"+place);
	}
	public void res(int age)
	{
		System.out.println("Age:"+age);
	}
	
	void display(String name) {
		System.out.println("Name:"+name);
		
	}
	
}
public class MultipleinterfaceDemo 
{

	public static void main(String[] args) 
	{
		Example3 oo=new Example3();
		oo.getres("banagalore");
		oo.res(25);
		oo.display("vijayanaga");
	

	}

}
