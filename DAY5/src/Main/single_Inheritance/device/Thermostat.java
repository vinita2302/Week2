package Main.single_Inheritance.device;


class Thermostat extends Device {
    public double temperatureSetting;

    Thermostat(String deviceId, String status, double tempratureSettString) {
        super(deviceId, status);
        this.temperatureSetting = tempratureSettString;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("TempratureSetting: " + temperatureSetting);
    }

}