package com.sgtesting.constructor;
class Matrix
{
	Matrix(int num[][])
	{

		for(int i=0;i<num.length;i++) 
		{
			for(int j=0;j<num[i].length;j++)
			{
				System.out.print(num[j][i]+" ");
			}
				System.out.println(" ");
	
		}
	}
}

public class Assignment3 {

	public static void main(String[] args) {
		int num[][]= {{10,20,30},{50,70,90},{100,130,140}};
	    new Matrix(num);
		}

	}


