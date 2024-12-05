//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person m1=new Person("Pratham",14,"Mumbai,India");
        Person m6=new Person();
        Person m2=new Person("Adarsh",18,"Mumbai,India");
        Student s1=new Student(45,"Maths");
        Student s2=new Student("Pratham",15,"Mumbai",21,"English");
        Student s3=new Student(s1);
        Person m5=new Person(m2);
        m1.displayInfo();
        m2.displayInfo();
        m6.displayInfo();
        m5.displayInfo();
        s1.displayInfo();
        s3.displayInfo();
        }
    }
