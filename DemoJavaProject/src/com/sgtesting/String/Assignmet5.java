package com.sgtesting.String;

public class Assignmet5 {

	public static void main(String[] args) {
		String s="Program";
		char ch[]=s.toCharArray();
		for(int i=1;i<=7;i++)
		{
			int k=0;
			for(int j=i;j<=7;j++)
			{
				System.out.print(ch[k]+" ");
				k++;
			}
			System.out.println( );
			
		}

	}

}
