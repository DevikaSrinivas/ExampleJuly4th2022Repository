package com.sgtesting.practiceprograms;

public class LastRowFor {

	public static void main(String[] args) {
		int b[][]= {{10,20,30,40},{5,10,15,20},{15,30,45,50}};
		int row=3;
		int col=b[row].length-1;
		for(int i=0;i<=col;i++)
		{
		    System.out.println(b[row][i]+ "");
	
		}
		

	}

}
