public class Admin  extends Person{
    private String adminId;
    private String department;
    Admin(){
        this.adminId="AD00";
        this.department="Default";
    }
    Admin(String adminId,String department){
        this.adminId=adminId;
        this.department=department;
    }
    Admin(String name,int age,String address,String adminId,String department){
        super(name, age, address);
        this.adminId=adminId;
        this.department=department;
    }
    Admin(Admin a){
        this.adminId=a.adminId;
        this.department=a.department;
    }
    public void displayInfo(){
        System.out.println("I am an Admin my Id is "+adminId+" My department is "+department);
    }

}
