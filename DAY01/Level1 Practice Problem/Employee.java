class Employee {

    // Attributes
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize the employee object
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee("Alice", 101, 55000);
        Employee emp2 = new Employee("Bob", 102, 60000);

        emp1.displayDetails();
        emp2.displayDetails();
    }
}
