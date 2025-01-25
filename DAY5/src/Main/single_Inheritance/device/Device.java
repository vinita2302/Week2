package Main.single_Inheritance.device;

class Device {
    protected String deviceId;
    protected String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayInfo() {
        System.out.println("DeviceId: " + deviceId);
        System.out.println("Status: " + status);
    }
}