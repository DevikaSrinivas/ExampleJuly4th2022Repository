package com.sgtesting.mehodsresturnvalues;

class Divisable
{
	int getnumber()
	{
		int count=0;
		for(int i=50;i<=100;i++)
		{
			if(i%6==0)
			{
				count++;
			}
		}return count;
	}
}
public class Assignment4 {

	public static void main(String[] args) {
		Divisable obj=new Divisable();
		int s=obj.getnumber();
		System.out.println(s);

	}

}
