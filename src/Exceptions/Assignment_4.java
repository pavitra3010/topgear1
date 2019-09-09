package Exceptions;

import java.util.Scanner;

public class Assignment_4 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int flag=1;
				String word=sc.next();
				for(int i=0;i<word.length();i++)
				{
					if(word.charAt(i)!=word.charAt(word.length()-1-i))
					{
						flag=2;
					}
				}
				if(flag==1)
				{
					System.out.println("Palindrome");
				}
				else
				{
					System.out.println("not Palindrome");
	
				}
	}

}
