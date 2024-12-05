class Teacher extends Person implements CanManage {
    private String subject;
    private int salary;

    // Default constructor for Teacher
    Teacher() {
        super();  // Call the parent constructor (Person)
        this.subject = "Default Subject";
        this.salary = 0;
    }

    // Constructor with subject and salary
    Teacher(String subject, int salary) {
        super();  // Call the parent constructor (Person)
        this.subject = subject;
        this.salary = salary;
    }

    // Constructor with all properties including those from Person
    Teacher(String name, int age, String address, String subject, int salary) {
        super(name, age, address);  // Call the parent constructor (Person)
        this.subject = subject;
        this.salary = salary;
    }

    // Copy constructor for Teacher
    Teacher(Teacher t1) {
        super(t1);  // Call the copy constructor of the Person class
        this.subject = t1.subject;
        this.salary = t1.salary;
    }

    // Implement methods from CanManage interface
    @Override
    public void assignTask() {
        System.out.println(name + " has assigned a task.");
    }

    @Override
    public void getReports() {
        System.out.println(name + " is counting reports.");
    }

    // Display teacher-specific information
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call the displayInfo() method from Person
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}