package com.sgtesting.noargsconstrucutor;

class Variables
{
	int number;
	double num;
	Variables()
	{
		number=10;
		num=25.02;
		System.out.println("number:"+number);
		System.out.println("num:"+num);
		System.out.println("++++++++++++++++++++++++++++");
	}
}
class Fruits
{
	String fruitsname;
	int number;
	Fruits()
	{
		fruitsname="Apple";
		number=2;
		System.out.println("fruitsname:"+fruitsname);
		System.out.println("number:"+number);
		System.out.println("++++++++++++++++++++++++++++++");
	}
}
class Vegetables
{
	String vegetablename;
	int weights;
	Vegetables()
	{
		vegetablename="Beans";
		weights=1;
		System.out.println("vegetablename:"+vegetablename);
		System.out.println("weights:"+weights);
		System.out.println("++++++++++++++++++++++++++++");
	}
}
class Flowers
{
	String flowername;
	int number;
	Flowers()
	{
		flowername="Rose";
		number=3;
		System.out.println("flowername:"+flowername);
		System.out.println("number:"+number);
		System.out.println("++++++++++++++++++++++++++++");

	}
}
public class Assignment1
{
	public static void main(String args[])
	{
		Variables obj1=new Variables();

		Fruits obj2=new Fruits();


		Vegetables obj3=new Vegetables();

		Flowers obj4=new Flowers();

	}


}





