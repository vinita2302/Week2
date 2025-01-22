class Vehicle {
    // Static variable to hold the common registration fee
    private static double registrationFee;

    // Final variable to uniquely identify each vehicle
    private final String registrationNumber;

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Constructor to initialize the object using 'this' keyword
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Getter for registration fee (optional, for testing purposes)
    public static double getRegistrationFee() {
        return registrationFee;
    }

    // Method to display vehicle details if the object is an instance of Vehicle
    public void displayRegistrationDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) obj; // Downcasting obj to Vehicle
            System.out.println("Owner Name: " + vehicle.ownerName);
            System.out.println("Vehicle Type: " + vehicle.vehicleType);
            System.out.println("Registration Number: " + vehicle.registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("The provided object is not a Vehicle.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Update the registration fee
        Vehicle.updateRegistrationFee(5000.0);

        // Create Vehicle objects
        Vehicle car = new Vehicle("Alice", "Car", "REG1234");
        Vehicle bike = new Vehicle("Bob", "Bike", "REG5678");

        // Display their details
        car.displayRegistrationDetails(car);
        bike.displayRegistrationDetails(bike);

        // Test instanceof with a non-Vehicle object
        String notAVehicle = "I am not a vehicle";
        car.displayRegistrationDetails(notAVehicle);
    }
}
