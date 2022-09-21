package com.sgtesting.constructor;

class Resultant
{
	Resultant(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}	
		for(int j=0;j<b.length;j++)
		{
			c[k]=b[j];
			k++;	 
		}
		for(int z=0;z<=c.length-1;z++)
		{
		
			System.out.print(c[z]+" ");
		}
		System.out.println();
	}
}

public class Assignment4 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int b[]= {5,10,15,20};
		new Resultant(a,b);
	}
}


