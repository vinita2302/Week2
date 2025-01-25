package Main.multilevel_inheritance.education_course;

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // Discount in percentage

    // Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee,
                            double discount) {
        super(courseName, duration, platform, isRecorded); // Call superclass constructor
        this.fee = fee;
        this.discount = discount;
    }

    // Getters
    public double getFee() {
        return fee;
    }

    public double getDiscount() {
        return discount;
    }

    // Method to calculate the final price after discount
    public double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    // Overriding displayCourseDetails to include paid course details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails(); // Display details from OnlineCourse
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%, Final Fee: $" + calculateFinalFee());
    }
}
