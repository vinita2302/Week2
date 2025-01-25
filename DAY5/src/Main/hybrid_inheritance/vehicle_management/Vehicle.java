package Main.hybrid_inheritance.vehicle_management;

class Vehicle {
    private String model;
    private int maxSpeed;

    // Constructor
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Getters
    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}