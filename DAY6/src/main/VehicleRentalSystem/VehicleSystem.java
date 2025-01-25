package main.VehicleRentalSystem;
import java.util.*;
public class VehicleSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        // Adding vehicles to the list
        vehicles.add(new Car("CAR123", 500, "CINS123"));
        vehicles.add(new Bike("BIKE456", 200, "BINS456"));
        vehicles.add(new Truck("TRUCK789", 1000, "TINS789"));

        // Iterating over the list and displaying details
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }


        }
    }
}