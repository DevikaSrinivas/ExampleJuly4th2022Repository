package com.sgtesting.practiceprograms;

public class DoubleForDemo {

	public static void main(String[] args) {
		double a[][]= {{10,20,33,40},{15,30,45,50}};
		for(int i=a.length-1;i>=0;i--)
		{
				for(int j=a[i].length-1;j>=0;j--)
				{
						System.out.print(a[i][j] +" ");
				}
				System.out.println();
		}
	}

}
