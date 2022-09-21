package com.sgtesting.encapsulation;

class Software
{
	String companyname;
	String place;
}
class Hardware
{
	String companyname;
	String place;
}

public class Assignments6 {

	public static void main(String[] args) {
		Software Obj1=new Software();
		Obj1.companyname="tcs";
		Obj1.place="Banglore";
		System.out.println("companyname:"+Obj1.companyname);
		System.out.println("place:"+Obj1.place);
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		Hardware Obj2=new Hardware();
		Obj2.companyname="Dell";
		Obj2.place="Banglore";
		System.out.println("companyname:"+Obj2.companyname);
		System.out.println("place:"+Obj2.place);
		System.out.println("++++++++++++++++++++++++++++");
	}

}
