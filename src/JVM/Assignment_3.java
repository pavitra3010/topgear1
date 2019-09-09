package JVM;

import java.util.Scanner;

public class Assignment_3 {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
        double minutesInYear = 60 * 24 * 365;

        double min = input.nextDouble();

        float years = (float) (min / minutesInYear);
        float days = (float) (min / 60 / 24) % 365;

        System.out.println((float) min + " minutes is approximately " + years + " years and " + days + " days");
		
	}

}
