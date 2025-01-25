package Main.multilevel_inheritance.education_course;

class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    // Constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Call base class constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Getters
    public String getPlatform() {
        return platform;
    }

    public boolean isRecorded() {
        return isRecorded;
    }

    // Overriding displayCourseDetails to include online course details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails(); // Display base class details
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}
