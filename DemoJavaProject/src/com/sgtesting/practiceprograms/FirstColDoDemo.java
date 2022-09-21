package com.sgtesting.practiceprograms;

public class FirstColDoDemo {

	public static void main(String[] args) {
	int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
	int i=0;
	do
	{
		System.out.println(a[i][0]+ " ");
		i++;
	}while(i<=a.length-1);
	

	}

}
