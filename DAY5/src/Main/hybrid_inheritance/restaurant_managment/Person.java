package Main.hybrid_inheritance.restaurant_managment;

class Person {
    private String name;
    private int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Method to display personal details
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
