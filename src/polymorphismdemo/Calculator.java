package polymorphismdemo;

import java.util.Scanner;

public class Calculator {
    // all access modifiers are allowed in method overloading
    //static and non static methods can be overloaded
    //method overloading - compile time polymorphism
    public void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));

    }
    /*
    public double add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
        return a+b;
    }

     */

    // overloading by changing the number of parameter
    public void add(int a, int b, int c) {
        System.out.println("Sum of two integers: " + (a + b + c));
    }

    // overloading by changing the data type of parameter
    public void add(int a, double b) {
        System.out.println("Sum of integer and double: " + (a + b));
    }
    // overloading by changing the sequence  of parameter
    public void add(double a, int b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

    public  void getlogvalue(){
        System.out.println("get the value of log base 10");
    }

    public  static void getlogvalue(int a){
        System.out.println("get the value of log base 10 of "+a);
    }

    //can we acheive method overlading by changing the return type?
    // No, method overloading cannot be achieved by changing only the return type of the method.
    public static void main(String[] args) {

    }

    public static void main(int[] args){

    }
}
