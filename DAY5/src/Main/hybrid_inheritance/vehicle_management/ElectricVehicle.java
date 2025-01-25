package Main.hybrid_inheritance.vehicle_management;

class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // in kWh

    // Constructor
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed); // Call superclass constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Getter
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    // Method specific to ElectricVehicle
    public void charge() {
        System.out.println("Charging the vehicle. Battery capacity: " + batteryCapacity + " kWh");
    }

    // Overriding displayInfo to include battery details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Electric, Battery Capacity: " + batteryCapacity + " kWh");
    }
}

