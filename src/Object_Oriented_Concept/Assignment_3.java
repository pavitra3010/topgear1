package Object_Oriented_Concept;

public class Assignment_3 {
	Assignment_3(){
		
	}
	 class Book {
		  int isbn;
		
		 String title="";
		  float price;
		Book(int isbn, String title,float price)
		{
			this.isbn=isbn;
			this.title=title;
			
			this.price=price;	
		}
		public void details()
		{
			System.out.println("Book isbn is "+isbn);
			System.out.println("Book title is "+title);
		
			System.out.println("Original price of book is "+price);
		}
		public void discountedprice(float percent)
		{
			float discount=price-((float)(percent/100)*price);
			System.out.println("After Discount "+ discount);
		}
	}
	 class Novel extends Book{
		 String author="";
		 Novel(int isbn, String title,  float price,String author) {
			super(isbn, title,  price);
			// TODO Auto-generated constructor stub
			this.author=author;
		}	
		 public void display()
		 {
			 System.out.println("Book isbn is "+isbn);
				System.out.println("Book title is "+title);
				System.out.println("Book author is "+author);
				System.out.println("Original price of book is "+price);

		 }
	 }
	 class Magazine extends Book{
			String type="";
		 Magazine(int isbn, String title, float price,String type) {
			super(isbn, title, price);
			// TODO Auto-generated constructor stub
			this.type=type;
		}
		 public void display()
		 {
			    System.out.println("Book isbn is "+isbn);
				System.out.println("Book title is "+title);
				System.out.println("Book type is "+type);
				System.out.println("Original price of book is "+price);
	 
		 } 
		}

		public static void main(String args[])
		{
			Assignment_3 a=new Assignment_3();
		Book b1=a.new Book(1,"abc",234);
		Magazine m1=a.new Magazine(1,"abc",234,"a");
		m1.display();
		Novel n=a.new Novel(1,"abc",234,"a");
		n.display();
		
			
		}
		 
	 }

