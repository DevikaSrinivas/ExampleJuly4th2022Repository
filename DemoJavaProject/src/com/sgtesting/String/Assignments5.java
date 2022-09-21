package com.sgtesting.String;

public class Assignments5 {

	public static void main(String[] args) {
		String s="Program";
		char ch[]=s.toCharArray();
		for(int i=0;i<=7;i++)
		{
			
			for(int j=0;j<i;j++)
			{
				System.out.print(ch[j]+" ");
			}
			System.out.println();
		}

	}

}
