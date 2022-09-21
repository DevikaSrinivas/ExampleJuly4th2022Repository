package com.sgtesting.encapsulation;

class Country
{
	String EnglishName;
	String LocalName;
}
class State
{
	String Name;
	String captial;
}
class Village
{
	String Name;
	String District;
}

public class Assignment5 {

	public static void main(String[] args) {
		Country obj1=new Country();
		obj1.EnglishName="India";
		obj1.LocalName="Bharat";
		System.out.println("EnglishName:"+obj1.EnglishName);
		System.out.println("LocalName:"+obj1.LocalName);
		System.out.println("++++++++++++++++++++++++++++++");
		
		State obj2=new State();
		obj2.Name="Karnataka";
		obj2.captial="Bengaluru";
        System.out.println("Name:"+obj2.Name);
        System.out.println("captial:"+obj2.captial);
        System.out.println("++++++++++++++++++++++++++++++");
        
        Village obj3=new Village();
        obj3.Name="Gubbi";
        obj3.District="Tumkur";
        System.out.println("Name:"+obj3.Name);
        System.out.println("District:"+obj3.District);
        System.out.println("++++++++++++++++++++++++++++");
      
	}

}
