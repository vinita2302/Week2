class Circle {
    private double radius; 
    public Circle() {
        this(1.0); 
    }
    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Invalid radius. Setting to default value of 1.0.");
            this.radius = 1.0;
        }
    }

    // Method to calculate area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display circle details
    public void displayCircleDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    
    public static void main(String[] args) {
        // Create a Circle instance using the default constructor
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        defaultCircle.displayCircleDetails();

        // Create a Circle instance with user-provided radius
        Circle customCircle = new Circle(5.5);
        System.out.println("\nCustom Circle:");
        customCircle.displayCircleDetails();
    }
}