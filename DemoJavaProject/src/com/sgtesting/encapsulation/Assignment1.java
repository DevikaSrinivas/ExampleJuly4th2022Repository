package com.sgtesting.encapsulation;

		class Variables
		{
			int number;
			double num;
		}
		class Fruits
		{
			String fruitsname;
			int number;
		}
		class Vegetables
		{
			String vegetablename;
			int weights;
		}
	     class Flowers
		{
			String flowername;
			int number;
		}
		public class Assignment1
		{
			public static void main(String args[])
			{
				Variables obj1=new Variables();
				obj1.number=10;
				obj1.num=25.02;
				System.out.println("number:"+obj1.number);
				System.out.println("num:"+obj1.num);
				System.out.println("++++++++++++++++++++++++++++");
				
				Fruits obj2=new Fruits();
				obj2.fruitsname="Apple";
				obj2.number=2;
				System.out.println("fruitsname:"+obj2.fruitsname);
				System.out.println("number:"+obj2.number);
				System.out.println("++++++++++++++++++++++++++++++");
				
				Vegetables obj3=new Vegetables();
				obj3.vegetablename="Beans";
				obj3.weights=1;
				System.out.println("vegetablename:"+obj3.vegetablename);
				System.out.println("weights:"+obj3.weights);
				System.out.println("++++++++++++++++++++++++++++");
				
				Flowers obj4=new Flowers();
				obj4.flowername="Rose";
				obj4.number=3;
				System.out.println("flowername:"+obj4.flowername);
				System.out.println("number:"+obj4.number);
				System.out.println("++++++++++++++++++++++++++++");
		
			}
			
			
		}
			
			
		
			
		
