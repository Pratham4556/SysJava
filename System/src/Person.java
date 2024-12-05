public class Person {
    String name;
    int age;
    String address;

    Person(){
        this.name="Default";
        this.age=0;
        this.address="Deafult,Default";

    }
    Person(Person p1){
        this.name=p1.name;
        this.age=p1.age;
        this.address=p1.address;
    }
    Person(String name,int age,String address){ //cONSTRUCTOR TO ADD AGE//
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public void displayInfo(){
        System.out.println("name: "+name+" age: "+age+" address:"+address);
    }


}
