package com.sgtesting.practiceprograms;

public class ByteDoDemo {

	public static void main(String[] args) {
		byte s[][]= {{5,10,15},{10,20,30}};
		{
			int i=0;
			do
			{
				int j=0;
				do
				{
					System.out.print(s[i][j]+ " ");
					j++;
			    }while(j<s[i].length);
			i++;
			System.out.println();
			}while(i<s.length);
			}
		}

	}

