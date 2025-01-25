package Main.employee_managment;

class Manager extends Employee {
    private int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        System.out.println("name :" + name);
        System.out.println("id :" + id);
        System.out.println("salary :" + salary);
        System.out.println("Team size is: " + teamSize);
    }

}