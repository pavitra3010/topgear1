package Exceptions;

public class Assignment_2 {
	public static void main(String args[])
	{
		int sum=0;int sum1=0;
		try
		{
		sum=Integer.parseInt(args[2])+Integer.parseInt(args[3])+Integer.parseInt(args[4]);
		System.out.println("The average marks of "+args[0]+" is"+sum/3);
		sum=Integer.parseInt(args[5])+Integer.parseInt(args[6])+Integer.parseInt(args[5]);
		System.out.println("The average marks of "+args[1]+" is"+sum/3);
				
		}
		catch(NumberFormatException ex)
		{
			System.out.println("please enter number");
		}
	}

}
