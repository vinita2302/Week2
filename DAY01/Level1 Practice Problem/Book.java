 public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }

    public void display() {
        System.out.println("Book Deatails");
        System.out.println("The title is: " + title);
        System.out.println("Author name is: " + author);
        System.out.println("Price of book: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 18.99);
        Book book2 = new Book("1984", "George Orwell", 14.99);

        book1.display();
        book2.display();

    }
}
