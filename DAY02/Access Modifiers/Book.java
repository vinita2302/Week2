class Book {
    public String ISBN; 
    protected String title; 
    private String author; 

    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get the author's name
    public String getAuthor() {
        return author;
    }

    // Public method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass to demonstrate access to ISBN and title
class EBook extends Book {

    private double fileSize; 

    // Constructor to initialize EBook details
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display EBook details
    @Override
    public void displayBookDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title); 
        System.out.println("File Size: " + fileSize + " MB");
    }
}

// Main class to test the implementation
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create Book instance
        Book book = new Book("123-456-789", "Java Programming", "Alice");
        book.displayBookDetails();

        // Modify author name
        book.setAuthor("Bob");
        System.out.println("\nAfter updating author name:");
        book.displayBookDetails();

        // Create EBook instance
        EBook eBook = new EBook("987-654-321", "Advanced Java", "Charlie", 5.25);
        System.out.println("\nE-Book Details:");
        eBook.displayBookDetails();
    }
}