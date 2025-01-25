package Main.employee_managment;

class Intern extends Employee {
    private int duration;

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;

    }

    public void displayDetails() {
        System.out.println("name :" + name);
        System.out.println("id :" + id);
        System.out.println("salary :" + salary);
        System.out.println("Duration: " + duration);
    }

}