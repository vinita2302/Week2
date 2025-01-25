package Main.employee_managment;

class Developer extends Employee {
    private String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;

    }

    public void displayDetails() {
        System.out.println("name :" + name);
        System.out.println("id :" + id);
        System.out.println("salary :" + salary);
        System.out.println("programmingLanguage is: " + programmingLanguage);
    }

}