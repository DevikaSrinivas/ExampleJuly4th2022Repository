package com.sgtesting.constructor;

class Substration
{
	Substration(int a[][],int b[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				int res=a[i][j]-b[i][j];
				System.out.print(res+"  ");
			}
			System.out.println();
			
		}
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60}};
		int b[][]= {{5,10,15},{10,20,30}};
		new Substration(a,b);
		}

	}


