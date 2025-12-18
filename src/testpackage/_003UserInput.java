package testpackage;

import java.util.Scanner;

public class _003UserInput {

    public static void main(String[] args) {
        /*
        int a= 3;
        int b = 10;
        int sum = a + b;
        System.out.println("Sum of "+a+" and "+b+" is: "+sum);
*/
        // to take user input , use Scanner class
        // to use any class from a package, we need to create object of that class
        Scanner input= new Scanner(System.in);
        System.out.println("Enter name: ");
        // taking string input fom user
        //   String name= input.next();
         String name= input.nextLine(); // to take string with spaces
        System.out.println("User entered name is: "+name);

        // integer input
        System.out.println("Enter age: ");
          int age= input.nextInt();
        System.out.println("User entered age is: "+age);
        // float input
        System.out.println("Enter height: ");
        float height= input.nextFloat();
        System.out.println("User entered height is: "+height);
        //boolean input
        System.out.println("Are you a student? (true/false): ");
        boolean isStudent= input.nextBoolean();
        System.out.println("User entered isStudent: "+isStudent);
        //char input
        System.out.println("Enter your grade (single character): ");
       char ch= input.next().charAt(0);
        System.out.println("User entered grade is: "+ch);

        // closing the scanner object
        input.close();

        /*
           Task: Take two numbers as input from user and print their sum, difference, product.
         */


    }
}
