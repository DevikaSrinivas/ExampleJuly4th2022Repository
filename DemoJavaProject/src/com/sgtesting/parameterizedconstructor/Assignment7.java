package com.sgtesting.parameterizedconstructor;

class Employee
{
	String employeename;
	int age;
	Employee(String Employee,int Age)
	{
		employeename=Employee;
		age=Age;
		System.out.println("employeename:"+employeename);
		System.out.println("age:"+age);
		System.out.println("++++++++++++++++++++++++++++");
	}
}
class Department
{
	String Deptname;
	String Colleagename;
	Department(String deptname,String colleagename)
	{
		Deptname=deptname;
		Colleagename=colleagename;
		System.out.println("Deptname:"+Deptname);
		System.out.println("Colleagename:"+Colleagename);
		System.out.println("+++++++++++++++++++++++++++++++++");
	
	}
}
class Insurance
{
	String name;
	int cost;
	Insurance(String Name,int Cost)
	{
		name=Name;
		cost=Cost;
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("++++++++++++++++++++++++++++++++");
	}
}
public class Assignment7 {

	public static void main(String[] args) {
		Employee obj1=new Employee("priya",26);
	
		
		Department obj2=new Department("ise","banglore");
	
		Insurance obj3=new Insurance("lic",10000);
		
	}

}
