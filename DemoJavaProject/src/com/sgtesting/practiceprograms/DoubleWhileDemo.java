package com.sgtesting.practiceprograms;

public class DoubleWhileDemo {

	public static void main(String[] args) {
		double b[][]= {{10,20,30},{10,20,30}};
		int  i=b.length-1;
		while(i>=0)
		{
			int j=b[i].length-1;
			while(j>=0)
			{
				System.out.print(b[i][j]+" ");
				j--;
			}
			i--;
			System.out.println();
		}

	}

}
