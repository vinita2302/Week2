package Main.multilevel_inheritance.education_course;

public class CourseSystem {
    public static void main(String[] args) {
        // Create a Course object
        Course course = new Course("Java Basics", 20);
        course.displayCourseDetails();

        System.out.println();

        // Create an OnlineCourse object
        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", 40, "Udemy", true);
        onlineCourse.displayCourseDetails();

        System.out.println();

        // Create a PaidOnlineCourse object
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Full Stack Development", 60, "Coursera", true, 299.99,
                20);
        paidOnlineCourse.displayCourseDetails();
    }
}

