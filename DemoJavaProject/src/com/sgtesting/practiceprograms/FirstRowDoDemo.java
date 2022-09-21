package com.sgtesting.practiceprograms;

public class FirstRowDoDemo {

	public static void main(String[] args) {
		int b[][]= {{10,20,30,40},{5,10,15,20},{15,30,45,50}};
		int row=0;
		int col=b[row].length;
		int i=0;
		do
		{
			System.out.println(b[row][i]+ " ");
			i++;
		}while(i<col);

	}

}
