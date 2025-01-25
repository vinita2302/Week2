package Main.hierarchical_inheritance.school_system;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display basic information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Method to display the role (to be overridden by subclasses)
    public void displayRole() {
        System.out.println("General Person");
    }
}
