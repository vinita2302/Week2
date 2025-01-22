import java.util.ArrayList;
import java.util.List;


class Department {
    private String departmentName;
    private List<Employee> employees;

    
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

  
    public void addEmployee(String name) {
        employees.add(new Employee(name));
    }

    public void removeEmployees() {
        employees.clear();
    }

   
    class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        // Getter method for employee name
        public String getName() {
            return name;
        }
    }

    // Getter method for department name
    public String getDepartmentName() {
        return departmentName;
    }
}

public class Company {
    private String companyName;
    private List<Department> departments;

    
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }


    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

  
    public void removeDepartments() {
        for (Department department : departments) {
            department.removeEmployees();  
        }
        departments.clear();  
    }

    // Method to show company details
    public void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department department : departments) {
            System.out.println("Department: " + department.getDepartmentName());
            for (Department.Employee employee : department.employees) {
                System.out.println("Employee: " + employee.getName());
            }
        }
    }

    public static void main(String[] args) {
        // Create a company
        Company company = new Company("TechCorp");

        // Add departments to the company
        company.addDepartment("HR");
        company.addDepartment("Engineering");

        // Add employees to each department
        company.departments.get(0).addEmployee("Alice");
        company.departments.get(0).addEmployee("Bob");
        company.departments.get(1).addEmployee("Charlie");

        // Display company details
        company.showCompanyDetails();

        // Remove all departments and employees when company is deleted
        company.removeDepartments();
        System.out.println("\nAfter deleting the company, showing details:");
        company.showCompanyDetails();  // This will show no departments or employees
    }
}
