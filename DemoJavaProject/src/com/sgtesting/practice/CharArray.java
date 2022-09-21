package com.sgtesting.practice;
class DemoUser
{
	char[][] getres()
	{
		char a[][]= {{'a','b','c'},{'d','e','f'}};
		return a;
	}
}

public class CharArray {

	public static void main(String[] args)
	{
		DemoUser obj=new DemoUser();
		char[][]ss=obj.getres();
		for(int i=0;i<ss.length;i++)
		{
			for(int j=0;j<ss[i].length;j++)
			{
				System.out.println(ss[i][j]);
			}
		}
		
	}

}
