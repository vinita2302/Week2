package main.hospital_patient_management;

public class HospitalManagement {
    public static void main(String[] args) {
        // Create InPatient and OutPatient objects
        Patient inPatient = new InPatient(123, "John Doe", 45, 10); // 10 days stay
        Patient outPatient = new OutPatient(456, "Jane Smith", 30, 500); // Consultation fee

        // Create MedicalHistory objects for each patient
        MedicalHistory inPatientHistory = new MedicalHistory();
        inPatientHistory.addRecord("Diagnosis: Severe infection");
        inPatientHistory.addRecord("Treatment: IV antibiotics");

        MedicalHistory outPatientHistory = new MedicalHistory();
        outPatientHistory.addRecord("Diagnosis: Fever");
        outPatientHistory.addRecord("Treatment: Rest and hydration");

        // Display patient details and calculate bill dynamically using polymorphism
        System.out.println(inPatient.getPatientDetails());
        System.out.println("Medical Records:\n" + inPatientHistory.viewRecords());
        System.out.println("Total Bill: " + inPatient.calculateBill() + "\n");

        System.out.println(outPatient.getPatientDetails());
        System.out.println("Medical Records:\n" + outPatientHistory.viewRecords());
        System.out.println("Total Bill: " + outPatient.calculateBill());
    }
}
