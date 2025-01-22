class Patient{

private static String hospitalName="Bansal Hospital"; 
private static int totalPatients=0;  
private String name; 
private int age; 
private String ailment; 
private final int patientID; 
 
public Patient(String name,int age,String ailment){
this.name=name; 
this.age=age; 
this.ailment=ailment; 
this.patientID=++totalPatients;
}  

  // Method to display patient details
    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Object is not an instance of Patient.");
        }
    } 
	
public static int getTotalPatients(){
 return totalPatients;
  } 
 public static void main(String[] args){
 Patient patient1 = new Patient("John Doe", 30, "Flu");
        Patient patient2 = new Patient("Jane Smith", 25, "Cold");

        // Displaying patient details
        patient1.displayDetails();
        System.out.println();
        patient2.displayDetails();

        // Display total patients admitted
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
}  
}