public class Teacher  extends Person{
    private String subject;
    private int salary;
    Teacher(){
        this.subject="Deafult";
        this.salary=0;
    }
    Teacher(String subject,int salary){
        this.subject=subject;
        this.salary=salary;
    }
    Teacher (String name,int age,String address,String subject,int salary){
        super(name, age, address);
        this.subject=subject;
        this.salary=salary;
    }
    Teacher(Teacher t1){
        this.salary= t1.salary;
        this.subject=t1.subject;
    }
    public void displayInfo(){
        System.out.println("I am a Teacher who teaches "+subject+" My current salary is "+salary);
    }
}
