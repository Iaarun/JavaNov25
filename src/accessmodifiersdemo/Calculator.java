package accessmodifiersdemo;

public class Calculator {
    private  int sum;
    int diff;
    protected double mulitply;
    public double divide;
    public static String name;

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.privatemethod();
        calc.defaultmethod();
        calc.protectedmethod();
        calc.publicmethod();


       name="Simple Calculator";
         System.out.println("Calculator Name: "+name);

         staticMethod();

        calc.add(10, 5);

        int res= calc.subtract(10, 5);
        System.out.println("Difference: "+ (res+10));

        String greeting= calc.sayHello("Alice");
        System.out.println(greeting);

    }

    private void privatemethod(){
        System.out.println("This is a private method.");
    }
    void defaultmethod(){
        System.out.println("This is a default method.");
    }
    protected void protectedmethod() {
        System.out.println("This is a protected method.");
    }
    public void publicmethod() {
        System.out.println("This is a public method.");
    }

    public static void staticMethod(){
        System.out.println("This is a static method.");
    }

     //return type method
    public void add(int a, int b){
        sum=a+b;
        System.out.println("Sum: "+sum);
    }

    public int subtract(int a, int b){
        diff=a-b;
        return diff;

    }

    public String sayHello(String name){
        return "Hello! "+name;
    }


}
