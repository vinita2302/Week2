package Main.hybrid_inheritance.restaurant_managment;

class Chef extends Person implements Worker {
    private String specialty;

    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id); // Call superclass constructor
        this.specialty = specialty;
    }

    // Getters
    public String getSpecialty() {
        return specialty;
    }

    // Implementation of performDuties() method from Worker interface
    @Override
    public void performDuties() {
        System.out.println("Preparing dishes. Specialty: " + specialty);
    }

    // Overriding displayInfo to include additional details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Chef, Specialty: " + specialty);
    }
}