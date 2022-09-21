package com.sgtesting.interfacedemo;
interface company45
{
	String name="Devika";
	void showname();
}
interface company32 extends company45
{
	int age=12;
	void showage();
}
class Display21 implements company32
{
	public void showname()
	{
		System.out.println("Name:"+name);
	}
	public void showage()
	{
		System.out.println("Age:"+age);
	}
	String place="Vijayanagr";
	void res()
	{
		System.out.println("Place:"+place);
	}
}
public class Variableinterface12Demo {

	public static void main(String[] args) 
	{
		Display21 obj=new Display21();
		obj.showname();
		obj.showage();
		obj.res();

	}

}
