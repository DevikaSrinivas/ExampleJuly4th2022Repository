package com.sgtesting.parameterizedconstructor;

class Software
{
	String companyname;
	String place;
	Software(String company,String place)
	{
		companyname=company;
		place=place;
		System.out.println("companyname:"+companyname);
		System.out.println("place:"+place);
		System.out.println("++++++++++++++++++++++++++++++++++");
	}
}
class Hardware
{
	String companyname;
	String place;
	Hardware(String Company,String place)
	{
		companyname=Company;
		place=place;
		System.out.println("companyname:"+companyname);
		System.out.println("place:"+place);
		System.out.println("++++++++++++++++++++++++++++");
	}
	
}

public class Assignments6 {

	public static void main(String[] args) {
		Software Obj1=new Software("tcs","tumkur");
		
		
		Hardware Obj2=new Hardware("tcs","banglore");
		
	}

}
