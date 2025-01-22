import java.util.ArrayList;
import java.util.List;

// Define the University class
class University1 {
    private String name;
    private List<Course> courses;
    private List<Student> students;
    private List<Professor> professors;

    // Constructor for University
    public University(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public String getName() {
        return name;
    }
}

// Define the Course class
class Course {
    private String courseName;
    private Professor professor;
    private List<Student> enrolledStudents;

    // Constructor for Course
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.addCourse(this);
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollCourse(this); // Establish association
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}

// Define the Professor class
class Professor {
    private String name;
    private List<Course> courses;

    // Constructor for Professor
    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }
}

// Define the Student class
class Student {
    private String name;
    private int studentId;
    private List<Course> courses;

    // Constructor for Student
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public List<Course> getCourses() {
        return courses;
    }
}

// Main class to demonstrate the functionality
public class UniversitySystem {
    public static void main(String[] args) {
        // Create a University
        University university = new University("Tech University");

        // Create Professors
        Professor professor1 = new Professor("Dr. John");
        Professor professor2 = new Professor("Dr. Emily");

        // Create Courses
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Algorithms");

        // Assign Professors to Courses
        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        // Create Students
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        // Enroll Students in Courses
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student2);

        // Add to University
        university.addCourse(course1);
        university.addCourse(course2);
        university.addProfessor(professor1);
        university.addProfessor(professor2);
        university.addStudent(student1);
        university.addStudent(student2);

        // Display relationships
        System.out.println("University: " + university.getName());
        for (Course course : university.getCourses()) {
            System.out.println("Course: " + course.getCourseName());
            System.out.println("  Professor: " + course.getProfessor().getName());
            System.out.print("  Enrolled Students: ");
            for (Student student : course.getEnrolledStudents()) {
                System.out.print(student.getName() + " ");
            }
            System.out.println();
        }
    }
}
