package Main.hybrid_inheritance.vehicle_management;

public class VehicleSystem {
    public static void main(String[] args) {
        // Create an ElectricVehicle object
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        ev.displayInfo();
        ev.charge();
        System.out.println();

        // Create a PetrolVehicle object
        PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 250, 60);
        pv.displayInfo();
        pv.refuel();
    }
}