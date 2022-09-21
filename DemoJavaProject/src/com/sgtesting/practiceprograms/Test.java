package com.sgtesting.practiceprograms;

public class Test {

	public static void main(String[] args) {
		int a[][]= {{100,200,300},{400,500,600}};
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=a.length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();	
		}
		
	}

}
