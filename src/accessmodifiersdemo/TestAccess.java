package accessmodifiersdemo;

public class TestAccess {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.defaultmethod();
        cal.protectedmethod();
        cal.publicmethod();

        Calculator.staticMethod();
        Calculator.name="Advanced Calculator";
        System.out.println("Calculator Name: "+Calculator.name);
    }
}
