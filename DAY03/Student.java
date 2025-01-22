class Student {
    // Static variable to hold the common university name
    private static String universityName;

    // Static variable to count the total number of students
    private static int totalStudents = 0;

    // Final variable to uniquely identify each student
    private final int rollNumber;

    // Instance variables
    private String name;
    private String grade;

    // Constructor to initialize the object using 'this' keyword
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; // Increment total students count on each new object creation
    }

    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Static method to set the university name
    public static void setUniversityName(String name) {
        universityName = name;
    }

    // Method to display student details if the object is an instance of Student
    public void displayStudentDetails(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj; // Downcasting obj to Student
            System.out.println("Name: " + student.name);
            System.out.println("Roll Number: " + student.rollNumber);
            System.out.println("Grade: " + student.grade);
            System.out.println("University: " + universityName);
        } else {
            System.out.println("The provided object is not a Student.");
        }
    }

    // Method to update the grade if the object is an instance of Student
    public void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {
            Student student = (Student) obj; // Downcasting obj to Student
            student.grade = newGrade;
            System.out.println("Grade updated for Roll Number: " + student.rollNumber);
        } else {
            System.out.println("The provided object is not a Student.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Set the university name
        Student.setUniversityName("Global University");

        // Create Student objects
        Student student1 = new Student("Alice", 101, "A");
        Student student2 = new Student("Bob", 102, "B");

        // Display student details
        student1.displayStudentDetails(student1);
        student2.displayStudentDetails(student2);

        // Update grade for a student
        student1.updateGrade(student1, "A+");

        // Display updated details
        student1.displayStudentDetails(student1);

        // Display total students enrolled
        Student.displayTotalStudents();

        // Test instanceof with a non-Student object
        String notAStudent = "I am not a student";
        student1.displayStudentDetails(notAStudent);
    }
}
