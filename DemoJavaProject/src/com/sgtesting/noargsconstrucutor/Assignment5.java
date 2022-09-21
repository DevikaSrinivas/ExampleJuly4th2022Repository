package com.sgtesting.noargsconstrucutor;

class Country
{
	String EnglishName;
	String LocalName;
	Country()
	{
		EnglishName="India";
		LocalName="Bharat";
		System.out.println("EnglishName:"+EnglishName);
		System.out.println("LocalName:"+LocalName);
		System.out.println("++++++++++++++++++++++++++++++");
	}
}
class State
{
	String Name;
	String captial;
	State()
	{
		Name="Karnataka";
		captial="Bengaluru";
        System.out.println("Name:"+Name);
        System.out.println("captial:"+captial);
        System.out.println("++++++++++++++++++++++++++++++");
	}
}
class Village
{
	String Name;
	String District;
	Village()
	{
		  Name="Gubbi";
	      District="Tumkur";
	      System.out.println("Name:"+Name);
	      System.out.println("District:"+District);
	      System.out.println("++++++++++++++++++++++++++++");
	}
}

public class Assignment5 {

	public static void main(String[] args) {
		Country obj1=new Country();
		
		
		State obj2=new State();
		
        
        Village obj3=new Village();
      
      
	}

}
