package com.sgtesting.practiceprograms;

public class ByteWhileDemo {

	public static void main(String[] args) {
		byte b[][]= {{10,20,30},{20,30,40}};
		int  i=0;
		while(i<=b.length-1)
		{
			int j=0;
			while(j<=b[i].length-1)
			{
				System.out.print(b[i][j]+" ");
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
