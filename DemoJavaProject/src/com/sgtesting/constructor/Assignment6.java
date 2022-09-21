package com.sgtesting.constructor;
class Asc
{

	Asc(int a[])
	{
		int asc=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					asc=a[i];
					a[i]=a[j];
					a[j]=asc;
				}
			}
			System.out.print(a[i]+" ");	
		}
	}
}
public class Assignment6 {

	public static void main(String[] args) {
		int a[]= {10,20,15,5};
		new Asc(a);


	}

}
