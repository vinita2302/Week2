package Main.single_Inheritance.library_managment;

class Author extends Book {
    public String name;
    public String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Name: " + name);
        System.out.println("Bio: " + bio);
    }

}