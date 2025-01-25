package Main.hierarchical_inheritance.school_system;

public class SchoolSystem {
    public static void main(String[] args) {
        // Create a Teacher object
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        teacher.displayInfo();
        teacher.displayRole();
        System.out.println();

        // Create a Student object
        Student student = new Student("Bob", 16, "10th Grade");
        student.displayInfo();
        student.displayRole();
        System.out.println();

        // Create a Staff object
        Staff staff = new Staff("Charlie", 40, "Administration");
        staff.displayInfo();
        staff.displayRole();
    }
}