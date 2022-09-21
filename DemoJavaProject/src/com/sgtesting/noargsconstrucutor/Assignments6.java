package com.sgtesting.noargsconstrucutor;

class Software
{
	String companyname;
	String place;
	Software()
	{
		companyname="tcs";
		place="Banglore";
		System.out.println("companyname:"+companyname);
		System.out.println("place:"+place);
		System.out.println("++++++++++++++++++++++++++++++++++");
	}
}
class Hardware
{
	String companyname;
	String place;
	Hardware()
	{
		companyname="Dell";
		place="Banglore";
		System.out.println("companyname:"+companyname);
		System.out.println("place:"+place);
		System.out.println("++++++++++++++++++++++++++++");
	}
	
}

public class Assignments6 {

	public static void main(String[] args) {
		Software Obj1=new Software();
		
		
		Hardware Obj2=new Hardware();
		
	}

}
