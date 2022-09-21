package com.sgtesting.constructor;
class Ascending
{
	Ascending(int a[])
	{
		int asc;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					asc=a[i];
					a[i]=a[j];
					a[j]=asc;
				}
			}
			System.out.println(a[i]);
		}
	}
}
	public class Assignment5 {

		public static void main(String[] args) 
		{
			int a[]= {10,5,20,15};
			new Ascending(a);
		}

	}
