package encapsulationdemo;

public class Test {
    public static void main(String[] args) {
        Employee emp = new Employee();
       /*
        emp.name = "<><><><><>>";
        emp.age = 5454;
        emp.empid = "E12345";

        System.out.println("Employee Name: " + emp.name);
        System.out.println("Employee Age: " + emp.age);
        System.out.println("Employee ID: " + emp.empid);
        */
        emp.setName("John Doe");
        emp.setAge(100);
        emp.setEmpid("E12345");

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee ID: " + emp.getEmpid());
        System.out.println("Organization Name: " + emp.getOrgName());
    }
}
