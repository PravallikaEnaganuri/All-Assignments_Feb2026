package WeeklyAssignments;


class Book{
	
	static String libraryName = "City Library";
    final int ISBN = 12345;
	String title;
	String author;
	
	Book(String title,String author){
		this.title =title;
		this.author=author;
	}
	
	void display() {
		System.out.println("Title:"+ this.title + "\n"+ "Author: "+ this.author);
	}
	
	void getDescription() {
		System.out.println("This a Physical Book");
	}
	
	static void showLibrary() {
		System.out.println("Library: " + libraryName);
	}
}

class EBook extends Book{
	String filesize;

	EBook(String title, String author,String filesize) {
		super(title, author);
		this.filesize = filesize;
	}
	void display() {
		super.display();
		System.out.println("FileSize:"+ this.filesize);
	}
	void getDescription() {
		System.out.println("This an Electronic Book");
	}
}

public class Asssignment7_Book {

	public static void main(String[] args) {
		
		EBook book = new EBook("Atomic Habits","James Clear","5MB");
		book.display();
		Book b1 = new Book("Atomic Habits","James Clear");
		b1.getDescription();
		book.getDescription();
		b1.showLibrary();
	//	b1.ISBN =99999;
		System.out.println("ISBN: " + b1.ISBN);
	}

}
