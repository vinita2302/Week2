class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("Radius of the Circle: " + radius);
        System.out.println("Area of the Circle: " + calculateArea());
        System.out.println("Circumference of the Circle: " + calculateCircumference());
    }

    public static void main(String[] args) {

        Circle circle = new Circle(5.0);

        circle.displayDetails();
    }
}
