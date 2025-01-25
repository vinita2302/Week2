package Main.hybrid_inheritance.vehicle_management;

class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelTankCapacity; // in liters

    // Constructor
    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed); // Call superclass constructor
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Getter
    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    // Implementation of refuel() method from Refuelable interface
    @Override
    public void refuel() {
        System.out.println("Refueling the vehicle. Tank capacity: " + fuelTankCapacity + " liters");
    }

    // Overriding displayInfo to include fuel details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Petrol, Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}

