package com.sgtesting.practiceprograms;

public class LastDoDemo {

	public static void main(String[] args) {
		int c[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int i=0;
		do
		{
			System.out.println(c[2][i]+ " ");
			i++;
		}while(i<=c.length-1);
			
		}

	}


