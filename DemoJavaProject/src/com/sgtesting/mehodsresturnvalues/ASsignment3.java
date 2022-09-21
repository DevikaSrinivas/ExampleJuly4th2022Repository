package com.sgtesting.mehodsresturnvalues;

class Count
{
	int getname1( )
	{
		int count=0;
		for(int i=91;i>=31;i--)
		{
			count++;
		}
		return count;
	}
}
public class ASsignment3 {

	public static void main(String[] args) {
		Count obj=new Count();
		int kk=obj.getname1();
		System.out.println(kk);

	}

}
