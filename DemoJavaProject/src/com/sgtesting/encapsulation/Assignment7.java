package com.sgtesting.encapsulation;

class Employee
{
	String employeename;
	int age;
}
class Department
{
	String Deptname;
	String Colleagename;
}
class Insurance
{
	String name;
	int cost;
}
public class Assignment7 {

	public static void main(String[] args) {
		Employee obj1=new Employee();
		obj1.employeename="pooja";
		obj1.age=26;
		System.out.println("employeename:"+obj1.employeename);
		System.out.println("age:"+obj1.age);
		System.out.println("++++++++++++++++++++++++++++");
		
		Department obj2=new Department();
		obj2.Deptname="ComputerScience";
		obj2.Colleagename="KIT";
		System.out.println("Deptname:"+obj2.Deptname);
		System.out.println("Colleagename:"+obj2.Colleagename);
		System.out.println("+++++++++++++++++++++++++++++++++");
	
		Insurance obj3=new Insurance();
		obj3.name="LIC";
		obj3.cost=10000;
		System.out.println("name:"+obj3.name);
		System.out.println("cost:"+obj3.cost);
		System.out.println("++++++++++++++++++++++++++++++++");
	}

}
