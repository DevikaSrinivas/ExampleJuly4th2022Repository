package com.sgtesting.mehodsresturnvalues;

class Demo6
{
	int[][] addition(int x[][],int y[][])
	{

		int c[][]=new int[x.length][y.length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				c[i][j]=x[i][j]+y[i][j];
			}
			
		}
		return c;
	}
}
public class Assignment9 {

	public static void main(String[] args) {
		Demo6 obj=new Demo6();
		int x[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int y[][]= {{5,10,15},{20,25,30},{35,40,45}};
		int k[][]=obj.addition(x,y);
	
		for(int a=0;a<k.length;a++)
		{
			for(int b=0;b<k[a].length;b++)
			{
				System.out.print(k[a][b]+" ");
			}
			System.out.println();
		}

	}

}
