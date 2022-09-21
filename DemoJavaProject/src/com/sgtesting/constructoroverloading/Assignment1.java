package com.sgtesting.constructoroverloading;

class EngineeringColleage
{
	EngineeringColleage(String firstname, int salary)
	{
		System.out.println("FirstName:"+firstname);
     	System.out.println("Salary:"+ salary);
	}
	EngineeringColleage(String branchname)
	{
		System.out.println("BranchName:"+branchname);
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		EngineeringColleage obj1=new EngineeringColleage("vinith",10000);
		EngineeringColleage obj2=new EngineeringColleage("ISE");

	}

}
