package com.sgtesting.practiceprograms;

public class StringForDemo {

	public static void main(String[] args) {
		String a[][]= {{"java","python","ccp"},{"sql","dbms","ml"}};
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
