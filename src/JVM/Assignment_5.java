package JVM;

import java.util.Scanner;

public class Assignment_5 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		if(num>999 && num<=9999)
		{
			while(num>0)
			{
				sum=sum+(num%10);
				num=num/10;
			}
			System.out.println(sum);
		}
		else
			System.out.println("please enter 4 digit number");
	}
}
	