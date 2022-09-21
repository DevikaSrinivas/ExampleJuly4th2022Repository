package com.sgtesting.parameterizedconstructor;

class Variables
{
	int number;
	double num;
	Variables(int numb,double number)
	{
		number=numb;
		num=number;
		System.out.println("number:"+number);
		System.out.println("num:"+num);
		System.out.println("++++++++++++++++++++++++++++");
	}
}
class Fruits
{
	String fruitsname;
	int number; 
	Fruits(String fs,int num)
	{
		fruitsname=fs;
		number=num;
		System.out.println("fruitsname:"+fruitsname);
		System.out.println("number:"+number);
		System.out.println("++++++++++++++++++++++++++++++");
	}
}
class Vegetables
{
	String vegetablename;
	int weights;
	Vegetables( String Vegetable,int weight)
	{
		vegetablename=Vegetable;
		weights=weight;
		System.out.println("vegetablename:"+vegetablename);
		System.out.println("weights:"+weights);
		System.out.println("++++++++++++++++++++++++++++");
	}
}
class Flowers
{
	String flowername;
	int number;
	Flowers(String fn,int num)
	{
		flowername=fn;
		number=num;
		System.out.println("flowername:"+flowername);
		System.out.println("number:"+number);
		System.out.println("++++++++++++++++++++++++++++");

	}
}
public class Assignment1
{
	public static void main(String args[])
	{
		Variables obj1=new Variables(10,20.5);

		Fruits obj2=new Fruits("orange",2);


		Vegetables obj3=new Vegetables("Beans",1);

		Flowers obj4=new Flowers("rose",3);

	}


}





