class Book
{
    // Static variable shared across all Book instances
    static String libraryName = "Pascals's Library";
    
    // Instance variables for book details
    String title; 
    String author; 

    // Final variable to ensure ISBN can't be changed once assigned
    final int isbn;
	
    // Constructor
    Book(String title, String author, int isbn)
    {
	this.title = title;
	this.author = author;
	this.isbn = isbn;
    }
	
    // Method to display details of a book
    public void displayDetails()
    {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Static method to display the shared library name
    public static void displayLibraryName()
    {
	System.out.println("Library Name is :- " +libraryName);
    }
}

public class LibraryManagementSystem
{
    public static void main(String[] args)
    {
        Book book1 = new Book("Effective Java", "Joshua Bloch", 1234345);
        Book book2 = new Book("Can't Hurt Me", "David Goggins", 2345678);

        // Display the library name 
        Book.displayLibraryName();
    
        System.out.println();

	// Check if book1 is an instance of Book before displaying its details 
        if(book1 instanceof Book)
        {
	    book1.displayDetails();
        }
    
        System.out.println();

	// Check if book2 is an instance of Book before displaying its details
        if(book2 instanceof Book)
        {
	    book2.displayDetails();
        } 
    }
}