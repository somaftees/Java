package book;

public class mains {

	public static void main(String[] args) {
		 
		  book b1 = new book("Moby-Dick", "Herman Melville", 600);
		  book b2 = new book("To Kill a Mockingbird", "Harper Lee", 250);
		  book b3 = new book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1500);
		  
		  
		  b1.printBookInfo();
		  b2.printBookInfo();
		  b3.printBookInfo();
		  
		  
		  book.printTotalNum();
		 }

	}
