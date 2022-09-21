package com.sgtesting.practiceprograms;

public class LastWhileDemo {

	public static void main(String[] args) {
		int a[][]= {{100,200,300},{150,300,450},{600,650,700}};
		int i=0;
		while(i<=a.length-1)
		{
			System.out.print(a[2][i]+ " ");
			i++;
		}

	}

}
