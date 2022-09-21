package com.sgtesting.mehodsresturnvalues;

class Sum
{
	int getname2()
	{
		int count=0;
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		return count;
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		Sum obj=new  Sum();
		int kk=obj.getname2();
		System.out.println(kk);
		}

	}


