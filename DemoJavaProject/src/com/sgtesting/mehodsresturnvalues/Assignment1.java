package com.sgtesting.mehodsresturnvalues;

class User
{
	int getname(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		User obj1=new User();
		int kk=obj1.getname(5);
		System.out.println(kk);


	}

}
