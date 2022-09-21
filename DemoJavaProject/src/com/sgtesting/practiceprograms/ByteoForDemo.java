package com.sgtesting.practiceprograms;

public class ByteoForDemo {

	public static void main(String[] args) {
		byte s[][]= {{10,20},{5,10,15}};
		{
			for(int i=0;i<s.length;i++)
			{
				for(int j=0;j<s[i].length;j++)
				{
					System.out.print(s[i][j] +" ");
				}
				System.out.println();
			}
		}

	}

}
