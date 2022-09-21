package com.sgtesting.practiceprograms;

public class FirstColWhileDemo {

	public static void main(String[] args) {
		int a[][]= {{5,10,15},{10,20,30},{25,50,75}};
		int i=0;
		while(i<=a.length-1)
		{
			System.out.println(a[i][0] +" ");
			i++;
		}

	}

}
