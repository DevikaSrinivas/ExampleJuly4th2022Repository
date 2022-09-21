package com.sgtesting.mehodsresturnvalues;

class Demo
{
	int getnumber()
	{
		int sum=0;
		for(int i=250;i<=350;i++)
		{
			if(i%2==0)
			{	
				sum++;
			}
		}	return sum;
	}
}

public class Assignment5 {

	public static void main(String[] args) {
		Demo obj=new Demo();
		int s=obj.getnumber();
		System.out.println(s);

	}

}
