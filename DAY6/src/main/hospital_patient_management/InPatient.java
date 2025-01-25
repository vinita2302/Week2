package main.hospital_patient_management;

class InPatient extends Patient {
    private int numberOfDays;

    public InPatient(int patientId, String name, int age, int numberOfDays) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double calculateBill() {
        double dailyRate = 1000;  // Example daily rate
        return dailyRate * numberOfDays;
    }

    // Additional method specific to inpatients
    public int getNumberOfDays() {
        return numberOfDays;
    }
}
