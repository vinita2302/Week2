package Main.hybrid_inheritance.restaurant_managment;

class Waiter extends Person implements Worker {
    private int tablesAssigned;

    // Constructor
    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id); // Call superclass constructor
        this.tablesAssigned = tablesAssigned;
    }

    // Getters
    public int getTablesAssigned() {
        return tablesAssigned;
    }

    // Implementation of performDuties() method from Worker interface
    @Override
    public void performDuties() {
        System.out.println("Serving customers. Tables assigned: " + tablesAssigned);
    }

    // Overriding displayInfo to include additional details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Waiter, Tables Assigned: " + tablesAssigned);
    }
}