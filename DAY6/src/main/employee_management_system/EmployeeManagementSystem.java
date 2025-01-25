package main.employee_management_system;



import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // List to hold employees
        List<Employee> employees = new ArrayList<>();

        // Creating FullTimeEmployee and PartTimeEmployee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "Alice", 50000, 10000);
        fullTimeEmployee.assignDepartment("Engineering");

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "Bob", 20000, 25, 50);
        partTimeEmployee.assignDepartment("Support");

        // Adding employees to the list
        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        // Processing and displaying employee details
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Calculated Salary: " + employee.calculateSalary());
            if (employee instanceof Department) {
                System.out.println(((Department) employee).getDepartmentDetails());
            }
            System.out.println("-----------------------");
        }
    }
}
