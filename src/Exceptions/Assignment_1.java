package Exceptions;

public class Assignment_1 {
	Assignment_1()
	{
		
	}
	@SuppressWarnings("serial")
	class InvalidAgeException extends Exception{
		@Override
		public String toString() {
			return ("Age must be >=18 and <60");
		}
	}
	public static void main(String[] args) {
		Assignment_1 a=new Assignment_1();
        String name = args[0];
		int age = Integer.parseInt(args[1]);
		if(age>=18 && age<60)
			System.out.println(name+" has proper Age");
		else
			try {
				throw a.new InvalidAgeException();
			}
			catch(InvalidAgeException ex) {
				ex.printStackTrace();
			}
	}


}
