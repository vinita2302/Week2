package main.ride_hailing_application;

public class VehicleDemo {
    public static void main(String[] args) {
        // Create different vehicle objects
        Vehicle car = new Car(123, "John Doe", 15.0);
        Vehicle bike = new Bike(456, "Jane Smith", 8.0);
        Vehicle auto = new Auto(789, "Sam Wilson", 10.0);

        // Update locations using GPS
        car.updateLocation("Downtown");
        bike.updateLocation("Uptown");
        auto.updateLocation("City Center");

        // Demonstrate polymorphism
        calculateAndPrintFare(car, 10.0); // Car fare for 10 km
        calculateAndPrintFare(bike, 10.0); // Bike fare for 10 km
        calculateAndPrintFare(auto, 10.0); // Auto fare for 10 km

        // Print current locations
        System.out.println("Car's Location: " + car.getCurrentLocation());
        System.out.println("Bike's Location: " + bike.getCurrentLocation());
        System.out.println("Auto's Location: " + auto.getCurrentLocation());
    }

    // Method to calculate and print fare for any vehicle
    public static void calculateAndPrintFare(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
        System.out.println();
    }
}