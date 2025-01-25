package Main.vehicle_and_transport;

class Truck extends Vehicle {
    private double loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("seatCapacity: " + loadCapacity);
    }

}