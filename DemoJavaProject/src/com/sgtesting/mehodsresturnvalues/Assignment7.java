package com.sgtesting.mehodsresturnvalues;
class Demo3
{
	int[] getnumber()
	{
		int a[]= {10,20,30,40,50,60};
		int b[]=new int[a.length/2];
		for(int i=0;i<a.length/2;i++)
		{
			b[i]=a[i];
		}
		return b;
	}
	
}
public class Assignment7 {

	public static void main(String[] args) 
	{
		Demo3 obj=new Demo3();
		int[] b=obj.getnumber();
		for(int kk:b)
		{
			System.out.println(kk);
		}
	}

}
