package com.sgtesting.interfacedemo;

interface employee
{
	void getres(String employeename);
}
interface age1 extends employee
{
	void getres(int employeeage);
}
interface place1 extends employee
{
	void getresult(String employeeplace);
}
class Company implements place1,age1
{
	public void getres(String employeename)
	{
		System.out.println("Name:"+employeename);
	}
	public void getres(int employeeage)
	{
		System.out.println("Age:"+employeeage);
	}
	public void getresult(String employeeplace)
	{
		System.out.println("Place:"+employeeplace);
	}
	void result(String address)
	{
		System.out.println("Address:"+address);
	}
}
public class HirerachcalInheritance {

	public static void main(String[] args) {
		Company obj=new Company();
		obj.getres("Ramya");
		obj.getresult("tumkur");
		obj.getres(12);
		obj.result("Banglore");

	}

}
