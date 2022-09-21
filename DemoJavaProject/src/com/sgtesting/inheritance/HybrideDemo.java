package com.sgtesting.inheritance;
class Demo01
{
	void res(String name,String age)
	{
		System.out.println("Name:"+ name);
		System.out.println("Age:"+age);
	}
}
class Demo02 extends Demo01
{
	void getres(String branchname)
	{
		System.out.println("Branchname:"+branchname);
	}
}
class Demo03 extends Demo02
{
	void res(String place)
	{
		System.out.println("Place:"+place);
	}
}
class Demo4 extends Demo01
{
	void res( String colleage)
	{
		System.out.println("Number:"+colleage);
	}
}
public class HybrideDemo {

	public static void main(String[] args) {
	Demo03 o1=new Demo03();
	o1.res("priya", "25yrs");
	
	o1.getres("cse");
	o1.res("vijayanagar");
	
	Demo4 o=new Demo4();
	o.res("devika","26yrs");
	o.res("kit");
	
	

	}

}
