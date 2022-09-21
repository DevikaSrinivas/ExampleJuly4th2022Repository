package com.sgtesting.practiceprograms;

public class SubstractinDoDemo {

	public static void main(String[] args) {
		int a[][]= {{100,200,300},{400,500,600},{700,800,900}};
		int b[][]= {{100,150,200},{300,400,500},{600,700,800}};
		int c[][]=new int[3][3];
		int i=0;
		do
		{
			int j=0;
			do
			{
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+ " ");
				j++;
			}while(j<a[i].length);
			i++;
			System.out.println();
		}while(i<a.length);

	}

}
