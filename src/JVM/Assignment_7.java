package JVM;

import java.util.Scanner;

public class Assignment_7 {
	static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));  
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		  int i,fact=1;  
			  int number=sc.nextInt();
			  fact = factorial(number);   
			  System.out.println("Factorial of "+number+" is: "+fact);    
	}

}
