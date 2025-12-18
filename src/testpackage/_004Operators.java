package testpackage;

import java.util.Scanner;

/*
  Arithmetic Operators: +, -, *, /, %, ++, --
  Relational Operators: ==, !=, >, <, >=, <=
  Logical Operators: &&, ||, !
  Assignment Operators: =, +=, -=, *=, /=, %=
  unary Operators: +, --
  Ternary Operator: ? :
 */
public class _004Operators {
    public static void main(String[] args) {
        //object creation
        _004Operators obj = new _004Operators();
     //   obj.arithemticOpeartors();
     obj.ternaryOperator();
   //     System.out.println("10"+10);
    }

    //function
    public void arithemticOpeartors(){
        // +, -, *, /, %, ++, --
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt()  ;
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

     int sum = a+b;
    int difference= a-b;
    int product= a*b;
    int quotient= a/b;
    int remainder= a%b;
    System.out.println("Sum: "+sum);
    System.out.println("Difference: "+difference);
    System.out.println("Product: "+product);
    System.out.println("Quotient: "+quotient);
    System.out.println("Remainder: "+remainder);

    }

    public void assignmentOperators(){
        // =, +=, -=, *=, /=, %=
        int x = 10;// assignment

        int b = 10;

     //   int b = b+5;
            b +=5;
        System.out.println("Sum: " + b);

          b-=5;
        System.out.println("After Subtraction: " + b); // b= b-5

        b*=2;
        System.out.println("After Multiplication: " + b);   // b= b*2
        b/=5;
        System.out.println("After Division: " + b); // b= b/5
    }
    public void relationalOperators(){
        // ==, !=, >, <, >=, <=       always return boolean value
        int a = 10;
        int b = 20;
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b));   // false
        System.out.println("a < b: " + (a < b));   // true
        System.out.println("a >= b: " + (a >= b)); // false
        System.out.println("a<=b: " + (a <= b)); // true
        System.out.println("a <= b: " + (a <= b)); // true
    }
    public void logicalOperators(){
        // &&, ||, !
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (y && x));  // false
        System.out.println("x || y: " + (x || y));  //true
        System.out.println("!x: " + (!x));   //false
        System.out.println("!y: " + (!y));  // true
    }

    public void unaryOperators(){
        // ++, --
        int a = 5;
        System.out.println("Original a: " + a);
        //pre and post
       //
        System.out.println("Post-increment a: " + (a++)); //5
        System.out.println("After Post-increment a: " + a); //6    //+ is used as a concat operator here

        System.out.println("Pre-increment a: " + (++a)); //7
        System.out.println("After Pre-increment a: " + a); //7

        System.out.println("Post-decrement a: " + (a--)); //7
        System.out.println("After Post-decrement a: " + a);

        System.out.println("Pre-decrement a: " + (--a)); //5
        System.out.println("After Pre-decrement a: " + a); //5

    }

    public void ternaryOperator(){
        // condition ? statement1:satement2

        boolean israining = false;
        String activity = israining ? "Stay Indoors" : "Go for a walk";
        System.out.println("Activity: " + activity);

        int a = 40;
        int b = 20;
        int c =32;
      int max=  ((a>b) && (a>c) ? a :(b>c)? b:c);
        System.out.println("Maximum value is: " + max);

    }


}
