package com.sgtesting.practiceprograms;

public class ShortDoDemo {

	public static void main(String[] args) {
		short s[][]= {{5,10,15,20},{10,20,30,40}};
		{
			int i=s.length-1;
			do
			{
				int j=s[i].length-1;
				do
				{
					System.out.print(s[i][j]+ " ");
					j--;
			    }while(j>=0);
			i--;
			System.out.println();
			}while(i>=0);
			}
		}
	}

	


