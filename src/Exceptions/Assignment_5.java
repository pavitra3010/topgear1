package Exceptions;

import java.util.Scanner;

public class Assignment_5 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	        String str = sc.next();
	        int charcount = str.length() - str.replaceAll("a", "").length();
	        System.out.println("Occurrence Of A Char In String: " + charcount);
	}

}
