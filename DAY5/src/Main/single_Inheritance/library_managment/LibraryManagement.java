package Main.single_Inheritance.library_managment;

class LibraryManagement {
    public static void main(String[] args) {

        Author author = new Author("The Great Adventure", 2020, "John Doe",
                "John is a renowned writer of adventure novels.");

        System.out.println("Book and Author Details:");
        author.displayInfo();
    }
}