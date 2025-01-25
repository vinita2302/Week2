package Main.hierarchical_inheritance.school_system;

class Student extends Person {
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        super(name, age); // Call superclass constructor
        this.grade = grade;
    }

    // Getter
    public String getGrade() {
        return grade;
    }

    // Overriding displayRole to specify role as Student
    @Override
    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}