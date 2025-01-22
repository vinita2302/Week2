import java.util.ArrayList;
import java.util.List;

// Class representing a School
class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("Students in " + name + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

// Class representing a Student
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void displayCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println(course.getName());
        }
    }
}

// Class representing a Course
class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void displayStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        // Create a school
        School mySchool = new School("Greenfield High School");

        // Create students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Add students to the school
        mySchool.addStudent(alice);
        mySchool.addStudent(bob);

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Students enroll in courses
        alice.enrollInCourse(math);
        alice.enrollInCourse(science);
        bob.enrollInCourse(math);

        // Display data
        mySchool.displayStudents();
        alice.displayCourses();
        bob.displayCourses();
        math.displayStudents();
        science.displayStudents();
    }
}
