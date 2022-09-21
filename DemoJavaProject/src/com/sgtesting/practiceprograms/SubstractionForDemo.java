package com.sgtesting.practiceprograms;

public class SubstractionForDemo {

	public static void main(String[] args) {
		int a[][]= {{20,25,30},{10,40,15},{10,30,35}};
		int b[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int c[][]= new int[3][3];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=(a[i][j]-b[i][j]);
				System.out.print(c[i][j]+ "  ");
			}
			System.out.println();
		}

	}

}
