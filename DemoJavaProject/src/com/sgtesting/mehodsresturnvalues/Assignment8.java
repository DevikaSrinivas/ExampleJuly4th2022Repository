package com.sgtesting.mehodsresturnvalues;

class Demo4
{
	char[][] getname()
	{
		char ch[][]= {{'a','b'},{'c','d'}};
		return ch;
	}
}  
public class Assignment8 {
	public static void main(String[] args) 
	{
		Demo4 obj=new Demo4();
		 char[][] k=obj.getname();
		 
		 for(int a=0;a<k.length;a++)
		 {
			 for(int b=0;b<k[a].length;b++)
			 {
				 System.out.println(k[a][b]);
			 }
		 }
		 
		
	}

}
