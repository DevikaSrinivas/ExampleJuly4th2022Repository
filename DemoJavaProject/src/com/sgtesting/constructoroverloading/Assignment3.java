package com.sgtesting.constructoroverloading;

class SoftwareEngineer
{
	SoftwareEngineer(String name, int sal)
	{
		System.out.println("Name:"+name);
		System.out.println("Salary:"+sal);
	}
	SoftwareEngineer(String desiganation)
	{
		System.out.println("Designation:"+desiganation);
	}
}
public class Assignment3 {

	public static void main(String[] args) {
		SoftwareEngineer obj1=new SoftwareEngineer("Pooja",10000);
		SoftwareEngineer obj2=new SoftwareEngineer("software");

	}

}
