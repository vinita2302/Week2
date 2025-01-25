package main.hospital_patient_management;

public abstract class Patient {
    private int patientId;
    String name;
    int age;

    Patient(int patientId,String name,int age){
        this.patientId=patientId;
        this.name=name;
        this.age=age;
    }

    abstract double calculateBill();

    public int getPatientId(){
        return patientId;
    }

    public String getPatientDetails(){
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}
