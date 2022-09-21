package com.sgtesting.methods;
class Demo
{
	void read(char ch[][])
	{
		try 
		{	
		for(int i=ch.length-1;i>=0;i--)
		{
			for(int j=ch[i].length-1;j>=0;j--)
			{
				System.out.print(ch[i][j]+" ");
				
			}
		}System.out.println(" ");
		}catch(Exception t)
		{
			System.out.println(t);
		}
		
	
		
	}
}
public class Method {

	public static void main(String[] args) {
		Demo obj=new Demo();
		char ch[][]={{'a','b','c'},{'d','e','f'}};
		obj.read(ch);
	}

}
