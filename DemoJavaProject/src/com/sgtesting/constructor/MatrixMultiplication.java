package com.sgtesting.constructor;
class Multiplication
{
	Multiplication(int a[][],int b[][])
	{
		int c[][]=new int[2][2];
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++)
			{
			for(int k=0;k<a[i].length;i++)
			{
			 c[i][j]+=a[i][k]*c[k][j];
				System.out.println(c[i][j]+" ");
			}
			}
		}
	}
	
	
	
	
	
	
	
}
public class MatrixMultiplication {

	public static void main(String[] args) {
		int a[][]= {{10,20},{30,40}};
		int b[][]= {{5,10},{10,20}};
		
		new Multiplication(a,b);

	}

}
