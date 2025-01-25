package Main.vehicle_and_transport;

class Vehicle {
    public int maxSpeed;
    public String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("MaxSpeed :" + maxSpeed);
        System.out.println("FuelType :" + fuelType);
    }
}