package com.sgtesting.practiceprograms;

public class CharWhileDemo {

	public static void main(String[] args) {
		char ch[][]= {{'x','y','z'},{'m','n','o'}};
		
		int  i=0;
		while(i<=ch.length-1)
		{
			int j=0;
			while(j<=ch[i].length-1)
			{
				System.out.print(ch[i][j]+" ");
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
