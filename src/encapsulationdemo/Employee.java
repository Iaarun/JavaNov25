package encapsulationdemo;

public class Employee {
    private String name;
    private int age;
    private  String empid;

    public String getOrgName() {
        return orgName;
    }

    //readonly
    private String orgName="ABC Pvt Ltd";

    //getter and setter methods
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>18 || age<65){
            System.out.println("Invalid age for employee, it should be between 18 and 65");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }



}
