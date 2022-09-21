package com.sgtesting.practiceprograms;

public class DoubleDoDemo {

	public static void main(String[] args) {
		double s[][]= {{5,10,15,20,40},{10,20,30,40,50}};
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


