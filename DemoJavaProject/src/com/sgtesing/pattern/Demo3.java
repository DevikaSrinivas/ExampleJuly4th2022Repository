package com.sgtesing.pattern;

public class Demo3 {

	public static void main(String[] args)
	{
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print("#"+ " ");
				j++;
			}while(j<=5);
			i++;
			System.out.println();
		}while(i<=3);

	}

}
