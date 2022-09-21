package com.sgtesting.mehodsresturnvalues;
class Demo1
{
	boolean getres(int num)
	{
		boolean c=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				c=false;
				break;
			}
		}
	   return c;
		
	}
}
public class Assignment6 {

	public static void main(String[] args) {
		Demo1 obj=new Demo1();
		boolean res=obj.getres(19);
		System.out.println(res);
	
	}

}
