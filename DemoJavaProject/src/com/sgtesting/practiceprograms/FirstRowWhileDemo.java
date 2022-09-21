package com.sgtesting.practiceprograms;

public class FirstRowWhileDemo {

	public static void main(String[] args) {
	int a[][]= {{10,20,30,40},{50,60,70,80},{90,100,110,120}};
	int i=0;
	while(i<=a.length-1)
	{
		System.out.print(a[0][i]+ " ");
		i++;
	}
	}

}
