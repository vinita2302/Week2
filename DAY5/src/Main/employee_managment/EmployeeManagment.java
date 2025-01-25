package Main.employee_managment;


public class EmployeeManagment {
    public static void main(String[] args) {
        Employee emp1 = new Employee("karan", 01, 24000);
        Employee emp2 = new Employee("sahab", 12, 3400);

        Manager manager = new Manager("vinita", 101, 2000000, 7);
        manager.displayDetails();
        Intern intern = new Intern("shivani", 300, 4000, 9);


        Developer developer = new Developer("Alice", 102, 600000, "Java");
        developer.displayDetails();
    }
}
