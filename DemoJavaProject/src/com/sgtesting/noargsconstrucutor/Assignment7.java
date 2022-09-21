package com.sgtesting.noargsconstrucutor;

class Employee
{
	String employeename;
	int age;
	Employee()
	{
		employeename="pooja";
		age=26;
		System.out.println("employeename:"+employeename);
		System.out.println("age:"+age);
		System.out.println("++++++++++++++++++++++++++++");
	}
}
class Department
{
	String Deptname;
	String Colleagename;
	Department()
	{
		Deptname="ComputerScience";
		Colleagename="KIT";
		System.out.println("Deptname:"+Deptname);
		System.out.println("Colleagename:"+Colleagename);
		System.out.println("+++++++++++++++++++++++++++++++++");
	
	}
}
class Insurance
{
	String name;
	int cost;
	Insurance()
	{
		name="LIC";
		cost=10000;
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("++++++++++++++++++++++++++++++++");
	}
}
public class Assignment7 {

	public static void main(String[] args) {
		Employee obj1=new Employee();
	
		
		Department obj2=new Department();
	
		Insurance obj3=new Insurance();
		
	}

}
