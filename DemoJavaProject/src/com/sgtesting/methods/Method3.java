package com.sgtesting.methods;

class  Demo2
{
	String name(String x)
	{
		String res=x;
		return res;
	}

}
public class Method3 {
	public static void main(String[] args) {   
	Demo2 obj1=new Demo2();
	String kk=obj1.name("Devika");
	System.out.println(kk);

	}

}
