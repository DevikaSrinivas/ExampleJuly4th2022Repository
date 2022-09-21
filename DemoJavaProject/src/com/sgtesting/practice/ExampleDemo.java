package com.sgtesting.practice;
class UserDemo
{
	int getres()
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

public class ExampleDemo {

	public static void main(String[] args) {
		UserDemo obj=new UserDemo();
		int kk=obj.getres();
		System.out.println(kk);
	}

}
