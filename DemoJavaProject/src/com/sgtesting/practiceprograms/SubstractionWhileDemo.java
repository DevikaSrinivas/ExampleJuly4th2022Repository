package com.sgtesting.practiceprograms;

public class SubstractionWhileDemo {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{5,10,15},{15,30,35}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int c[][]=new int[3][3];
		int i=0;
		while(i<=a.length-1)
		{
			int j=0;
			while(j<a[i].length)
			{
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j] +" ");
				j++;
			}
			i++;
			System.out.println();
			
		}

	}

}
