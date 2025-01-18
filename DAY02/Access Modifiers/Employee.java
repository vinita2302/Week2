class Employee {
    public int employeeID; 
    protected String department;
    private double salary; 

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify the salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Salary cannot be negative.");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass to demonstrate access to employeeID and department
class Manager extends Employee {

    private int teamSize; 

    // Constructor to initialize manager details
    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    // Method to display manager details
    @Override
    public void displayEmployeeDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); 
        System.out.println("Department: " + department); 
        System.out.println("Team Size: " + teamSize);
    }
}


public class EmployeeManagement {
    public static void main(String[] args) {
        // Create Employee instance
        Employee employee = new Employee(101, "IT", 50000.00);
        employee.displayEmployeeDetails();

        // Modify salary
        employee.setSalary(55000.00);
        System.out.println("\nAfter updating salary:");
        employee.displayEmployeeDetails();

        // Create Manager instance
        Manager manager = new Manager(102, "HR", 75000.00, 10);
        System.out.println("\nManager Details:");
        manager.displayEmployeeDetails();
    }
}
