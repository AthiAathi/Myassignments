package week2.day1;

//main method to add a book
public class Library {
		public static String addbook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;	
}
//main method to issue a book
		public static String issueBook() {
		System.out.println("Book issued successfully");
		return "Book issued";
		
	}
		public static void main(String[] args) {
			Library myLibrary=new Library();
			String addbook=myLibrary.addbook("The concept of power");
			String issueBook=myLibrary.issueBook();
			System.out.println("The added book is" +" "+addbook);
			System.out.println("The book status is"+" " +issueBook);
		}
}
