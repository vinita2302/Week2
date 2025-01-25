package Main.hierarchical_inheritance.school_system;

class Staff extends Person {
    private String department;

    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age); // Call superclass constructor
        this.department = department;
    }

    // Getter
    public String getDepartment() {
        return department;
    }

    // Overriding displayRole to specify role as Staff
    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}