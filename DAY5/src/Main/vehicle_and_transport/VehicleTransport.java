package Main.vehicle_and_transport;

public class VehicleTransport {
    public static void main(String[] args) {
        Vehicle car = new Car(180, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 10);
        Vehicle motorcycle = new Motorcycle(150, "Petrol", 7);

        Vehicle[] vehicles = { car, truck, motorcycle };

        // Demonstrate polymorphism by calling displayInfo() on each object
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Details:");
            vehicle.displayInfo(); // Dynamic method dispatch
            System.out.println();

        }
    }
}