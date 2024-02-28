package book;

public class book {

	public String bookName;
	public String bookAuthor;
	public int pageNumber;
	private static int bookCounter;
	
	public book(String bookName, String bookAuthor, int pageNumber) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.pageNumber = pageNumber;
		bookCounter++;
	}
	
	public void printBookInfo() {
		System.out.println("Book Name: " + bookName);
		System.out.println("Book Author: " + bookAuthor);
		System.out.println("Page Number: " + pageNumber);
		System.out.println("----------------------------------------");
	}
	
	public static void printTotalNum() {
		System.out.println("The total nunber of books :" +bookCounter);
		
	}
}
