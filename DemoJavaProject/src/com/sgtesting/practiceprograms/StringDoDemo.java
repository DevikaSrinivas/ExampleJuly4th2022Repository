package com.sgtesting.practiceprograms;

public class StringDoDemo {

	public static void main(String[] args) {
		String s[][]= {{"java","python","ccp"},{"sql","dbms","ml"}};
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
