class Student {
    public int rollNumber; 
    protected String name;
    private double CGPA; 

    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Please enter a value between 0 and 10.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass to demonstrate the use of protected members
class PostgraduateStudent extends Student {

    private String specialization;

    // Constructor to initialize postgraduate student details
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Method to display postgraduate student details

    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Specialization: " + specialization);
    }
}

// Main class to test the implementation
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create Student instance
        Student student = new Student(101, "Alice", 8.5);
        student.displayStudentDetails();

        // Modify CGPA
        student.setCGPA(9.2);
        System.out.println("\nAfter updating CGPA:");
        student.displayStudentDetails();

        // Create PostgraduateStudent instance
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 9.0, "Computer Science");
        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayStudentDetails();
    }
}
