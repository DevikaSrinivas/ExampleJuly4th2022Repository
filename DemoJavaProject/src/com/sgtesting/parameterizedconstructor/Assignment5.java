package com.sgtesting.parameterizedconstructor;

class Country
{
	String EnglishName;
	String LocalName;
	Country(String englishname,String localname)
	{
		EnglishName=englishname;
		LocalName=localname;
		System.out.println("EnglishName:"+EnglishName);
		System.out.println("LocalName:"+LocalName);
		System.out.println("++++++++++++++++++++++++++++++");
	}
}
class State
{
	String Name;
	String captial;
	State(String name,String Capital)
	{
		Name=name;
		captial=Capital;
        System.out.println("Name:"+Name);
        System.out.println("captial:"+captial);
        System.out.println("++++++++++++++++++++++++++++++");
	}
}
class Village
{
	String Name;
	String District;
	Village(String name,String district)
	{
		  Name=name;
	      District=district;
	      System.out.println("Name:"+Name);
	      System.out.println("District:"+District);
	      System.out.println("++++++++++++++++++++++++++++");
	}
}

public class Assignment5 {

	public static void main(String[] args) {
		Country obj1=new Country("India","Bharat");
		
		
		State obj2=new State("Karnataka","Bengaluru");
		
        
        Village obj3=new Village("Gubbi","Tumkur");
      
      
	}

}
