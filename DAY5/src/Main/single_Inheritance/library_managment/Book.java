package Main.single_Inheritance.library_managment;

class Book {
    public String title;
    public int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}