package polymorphismdemo;
//super keyword referes to parent class instance variable and methods
//used to call parent class constructor
public class ScientificCalculator extends Calculator {

    public void getlogvalue() {
        System.out.println("get the value of natural log");

    }

    //method hiding - static methods
    public static void getlogvalue(int a) {
        System.out.println("get the value of natural log of " + a);
    }

    public static void main(String[] args) {
        ScientificCalculator sc = new ScientificCalculator();
        sc.getlogvalue();
        sc.getlogvalue(12);
    }
}
