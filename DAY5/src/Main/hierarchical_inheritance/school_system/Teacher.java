package Main.hierarchical_inheritance.school_system;

class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call superclass constructor
        this.subject = subject;
    }

    // Getter
    public String getSubject() {
        return subject;
    }

    // Overriding displayRole to specify role as Teacher
    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}


