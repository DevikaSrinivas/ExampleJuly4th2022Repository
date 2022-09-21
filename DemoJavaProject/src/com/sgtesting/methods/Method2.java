package com.sgtesting.methods;
class Demo1
{
	void read1(char ch[][])
	{
		char a[]=new char[ch.length*ch[0].length];
		int k=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[i].length;j++)
			{
				a[k]=ch[i][j];
				k++;
				
			}
		}
		for(int m=a.length-1;m>=0;m--)
		{
			System.out.println(a[m]);
			
		}
	}
}
public class Method2 {

	public static void main(String[] args) {
		Demo1 o=new Demo1();
		char z[][]= {{'a','b','c'},{'d','e','f'}};
		o.read1(z);

	}

}
