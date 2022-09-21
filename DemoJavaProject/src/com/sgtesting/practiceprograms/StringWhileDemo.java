package com.sgtesting.practiceprograms;

public class StringWhileDemo {

	public static void main(String[] args) {
		String a[][]= {{"javaScript","os","sms"},{"sql","dbms","ml"}};
		int  i=a.length-1;
		while(i>=0)
		{
			int j=a[i].length-1;
			while(j>=0)
			{
				System.out.print(a[i][j]+" ");
				j--;
			}
			i--;
			System.out.println();
		}

	}

}
