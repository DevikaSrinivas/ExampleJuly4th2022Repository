package com.sgtesting.practiceprograms;

public class ShortWhileDemo {

	public static void main(String[] args) {
		short b[][]= {{10,20},{10,20,30}};
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
