// Class representing a University
import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department department : departments) {
            System.out.println(department.getName());
        }
    }

    public void deleteUniversity() {
        System.out.println("Deleting University: " + name);
        departments.clear();
    }
}

// Class representing a Department
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Class representing a Faculty Member
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create a university
        University myUniversity = new University("Tech University");

        // Create departments
        Department csDepartment = new Department("Computer Science");
        Department eeDepartment = new Department("Electrical Engineering");

        // Add departments to the university
        myUniversity.addDepartment(csDepartment);
        myUniversity.addDepartment(eeDepartment);

        // Display departments in the university
        myUniversity.displayDepartments();

        // Create faculty members
        Faculty alice = new Faculty("Alice");
        Faculty bob = new Faculty("Bob");

        // Display faculty members (independent of departments)
        System.out.println("Faculty members:");
        System.out.println(alice.getName());
        System.out.println(bob.getName());

        // Delete the university and its departments
        myUniversity.deleteUniversity();
        System.out.println("All departments deleted with the university.");
    }
}
