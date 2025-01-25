package Main.employee_managment;

class Employee {
    public String name;
    protected int id;
    protected double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails1() {
        System.out.println("name :" + name);
        System.out.println("id :" + id);
        System.out.println("salary :" + salary);
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}