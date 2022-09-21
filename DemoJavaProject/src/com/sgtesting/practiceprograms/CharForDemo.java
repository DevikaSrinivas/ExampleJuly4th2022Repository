package com.sgtesting.practiceprograms;

public class CharForDemo {

	public static void main(String[] args) {
		char ch[][]= {{'A','B','C','D'},{'H','I','J','K'}};
		{
			for(int i=0;i<ch.length;i++)
			{
				for(int j=0;j<ch[i].length;j++)
				{
					System.out.print(ch[i][j] +" ");
				}
				System.out.println();
			}
		}

	}

}
