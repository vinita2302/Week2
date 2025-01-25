package Main.single_Inheritance.device;

public class SmartHomeDevices {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("T001", "Active", 22.5);
        thermostat.displayInfo();
    }
}
