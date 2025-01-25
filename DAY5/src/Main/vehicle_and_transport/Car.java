package Main.vehicle_and_transport;

class Car extends Vehicle {
    public int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;

    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("seatCapacity: " + seatCapacity);
    }

}
