public class Student  extends Person{
    private int rollNo;
    private String course;
    Student(){
        this.rollNo=0;
        this.course="Default";
    }
    Student(String name,int age,String address,int rollNo,String course){
        super(name,age,address);
        this.rollNo=rollNo;
        this.course=course;


    }
    Student(int rollNo,String course){
        this.rollNo=rollNo;
        this.course=course;
    }
    Student(Student s1){
        this.rollNo=s1.rollNo;
        this.course=s1.course;
    }
    public void displayInfo(){
        System.out.println("Roll no:-"+rollNo+" Has registered for "+course);
    }


}
