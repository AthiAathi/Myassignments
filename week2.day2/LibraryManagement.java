package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Library myLibrary=new Library();
			String addedbook=myLibrary.addbook("Religion and ethics");
			String issueStatus=myLibrary.issueBook();
		System.out.println("The book name is"+" "+addedbook);
		System.out.println("The book issue status is"+" "+issueStatus);
		}
		}

	
