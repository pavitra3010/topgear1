package Object_Oriented_Concept;

public class Assignment_1 {
	Assignment_1()
	{
	}
	
	 class Book {
		  int isbn;
		 String author="";
		 String title="";
		 float price;
		Book(int isbn, String title,String author,float price)
		{
			this.isbn=isbn;
			this.title=title;
			this.author=author;
			this.price=price;	
		}
		public void details()
		{
			System.out.println("Book isbn is "+isbn);
			System.out.println("Book title is "+title);
			System.out.println("Book author is "+author);
			System.out.println("Original price of book is "+price);
		}
		public void discountedprice(float percent)
		{
			float discount=price-((float)(percent/100)*price);
			System.out.println("After Discount "+ discount);
		}
	 }
		public static void main(String args[])
		{
			Assignment_1 a=new Assignment_1();
			Book bk=a.new Book(1,"Snow World","Pavitra",432);
			bk.details();
			bk.discountedprice(20);
			
		}
		


}
