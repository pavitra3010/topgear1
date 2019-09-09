package Exceptions;

public class Assignment_3 {
	public static void main(String args[])
	{
		int avg=0;
		try
		{
			avg=Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2])+Integer.parseInt(args[3])+Integer.parseInt(args[4]);
			System.out.println(avg/5);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
		System.out.println("please enter 5 numbers exactly");	
		}
	}

}
