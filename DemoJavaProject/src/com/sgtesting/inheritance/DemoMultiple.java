package com.sgtesting.inheritance;

class Demo1
{
	void mutiplication(int x,int y)
	{
		System.out.println("multiplication reslut:"+(x*y));
	}
}
class  Demo2 extends Demo1
{
	void substraction(int x, int y)
	{
		System.out.println("substraction result:"+(x-y));
	}
}
class Demo3 extends Demo2
{
	void addiation(int x,int y)
	{
		System.out.println("addiation result:"+(x+y));
	}
}
public class DemoMultiple {

	public static void main(String[] args) {
		Demo3 o1=new Demo3();
		o1.addiation(10,20);
		o1.substraction(20,10);
		Demo2 o2=new Demo2();
		o2.substraction(40,20);
		o2.mutiplication(10,20);
		

	}

}
