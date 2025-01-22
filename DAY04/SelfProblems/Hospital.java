import java.util.ArrayList;
import java.util.List;

// Define the Hospital class
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    // Constructor for Hospital
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public String getName() {
        return name;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }
}

// Define the Doctor class
class Doctor {
    private String name;
    private String specialty;
    private List<Patient> patients;

    // Constructor for Doctor
    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Establish bidirectional relationship
        }
    }

    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Doctor " + name + " is consulting patient " + patient.getName());
        } else {
            System.out.println("Patient " + patient.getName() + " is not assigned to Doctor " + name);
        }
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public List<Patient> getPatients() {
        return patients;
    }
}

// Define the Patient class
class Patient {
    private String name;
    private int age;
    private List<Doctor> doctors;

    // Constructor for Patient
    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this); // Establish bidirectional relationship
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}

// Main class to demonstrate the functionality
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create a Hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create Doctors
        Doctor doctor1 = new Doctor("Dr. Smith", "Cardiology");
        Doctor doctor2 = new Doctor("Dr. Brown", "Neurology");

        // Create Patients
        Patient patient1 = new Patient("Alice", 30);
        Patient patient2 = new Patient("Bob", 45);

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Establish relationships between doctors and patients
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient2);

        // Display consultations
        doctor1.consult(patient1); 
        doctor1.consult(patient2); 
        doctor2.consult(patient1); 
        doctor2.consult(patient2); 
    }
}
