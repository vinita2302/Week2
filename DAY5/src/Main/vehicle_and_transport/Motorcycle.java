package Main.vehicle_and_transport;


class Motorcycle extends Vehicle {
    public int seatCapacity;

    Motorcycle(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("seatCapacity: " + seatCapacity);
    }

}
