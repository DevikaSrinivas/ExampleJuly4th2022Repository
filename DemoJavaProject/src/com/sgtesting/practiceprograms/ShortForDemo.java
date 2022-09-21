package com.sgtesting.practiceprograms;

public class ShortForDemo {

	public static void main(String[] args) {
		short a[][]= {{10,20,33},{15,30,45}};
		for(int i=a.length-1;i>=0;i--)
		{
				for(int j=a[i].length-1;j>=0;j--)
				{
						System.out.print(a[i][j] +" ");
				}
				System.out.println();
		}

	}

}
