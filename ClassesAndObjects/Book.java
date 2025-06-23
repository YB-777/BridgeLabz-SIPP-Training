public class Book {
    private String title;
    private String author;
    private float price;

    // Constructor to initialize the title, author and price
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() 
    {
        System.out.println("Title of the book is:- " + title);
        System.out.println("Author of the book is:- " + author);
        System.out.println("Price of the book is:- " + price);
    }
    // Main method 
    public static void main(String[] args) {
        Book book1 = new Book("Can't Hurt Me", "David Goggins", 475.0f);
        Book book2 = new Book("Power of Subconscious Mind", "Dr. Joseph Murphy", 500.0f);

        System.out.println("Book 1 details :-");
        book1.displayDetails();
        System.out.println("\nBook 2 details :-");
        book2.displayDetails();
    }
}
