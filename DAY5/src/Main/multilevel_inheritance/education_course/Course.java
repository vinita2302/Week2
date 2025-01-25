package Main.multilevel_inheritance.education_course;

class Course {
    private String courseName;
    private int duration; // Duration in hours

    // Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName + ", Duration: " + duration + " hours");
    }
}
