package com.sgtesting.String;

public class Assignment3 {

	public static void main(String[] args)
	{
		charachter();
		palindrome();
		palindrome1();
	}
	private static void charachter()
	{
		String k="malayalam";
		String revk="";
		for(int i=k.length()-1;i>=0;i--)
		{
			revk=(revk+k.charAt(i));
		}
		if(k.toUpperCase().equals(revk.toUpperCase()))
		{
			System.out.println("The given String is a palindrome");
		}
		else
		{
			System.out.println("The given String is not palindrome");
		}
	
	}
	
	private static void palindrome()
	{
		String s="malayalam";
		char ch[]=s.toCharArray();
		char z[]=new char[ch.length];
		int n=0;
		for(int i=ch.length-1;i>=0;i--)
		{
			z[n]=ch[i];
			n++;
		}
		int marker=0;
		for(int i=0;i<z.length;i++)
		{
			if(z[i]!=ch[i])
			{
				marker++;
				break;
			}
		}
		if(marker==0)
		{
			System.out.println("its a palindrome");
		}
		else
		{
			System.out.println("its not a palindrome ");
		}
	}

	private static void palindrome1()
	{
		String s="malayalam";
		String revs="";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			revs=(revs+ch[i]);
		}
		if(s.equalsIgnoreCase(revs))
		{
			System.out.println("its a palindrome");
		}
		else 
		{
			System.out.println("its not a palindrome");
		}
		
	}
}
