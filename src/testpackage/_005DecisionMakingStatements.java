package testpackage;

import java.util.Scanner;

/*
Decision making
if statement
   if
   if else
   if else if - ladder if
   nested if

Switch case
 */
public class _005DecisionMakingStatements {
    public static void main(String[] args) {
        _005DecisionMakingStatements obj = new _005DecisionMakingStatements();
        obj.gradeUsingSwitchcase();
    }

    public void ifexample(){
        /*
        if(condition){
            // code to be executed if condition is true
        }
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i=sc.nextInt();

        if(i>0){
            System.out.println(i+" is a positive number.");
        }
        System.out.println("End of if example.");

    }

    public void ifElseExample(){
        /*
        if(condition){
            // code to be executed if condition is true
        } else {
            // code to be executed if condition is false
        }
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i=sc.nextInt();

        if(i>0){
            System.out.println(i+" is a positive number.");
        }else{
            System.out.println(i+" is not a positive number.");
        }
        System.out.println("End of if example.");

    }

    public void nestedIfExample() {
        /*
        if(condition1){
            // code to be executed if condition1 is true
            if(condition2){
                // code to be executed if condition2 is true
            }else{
                // code to be executed if condition2 is false
            }

        }esle{
            // code to be executed if condition1 is false
        }
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("called for the trials");
            System.out.println("Did you pass the trial? (true/false): ");
            boolean istrialPass= sc.nextBoolean();
            if(istrialPass){
                System.out.println("You will get Drivivng license");
            }else{
                System.out.println("Better luck next time");
            }
        }else{
            System.out.println("Not eligible for trials");
        }
    }
    public void ladderIfExample(){
        /*
        if(condition1){
            // code to be executed if condition1 is true
        } else if (condition2) {
            // code to be executed if condition2 is true
        } else if (condition3) {
            // code to be executed if condition3 is true
        }else{
            // code to be executed if all conditions are false
        }
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade: ");
        String grade= sc.nextLine();

        if (grade.equalsIgnoreCase("A")){
            System.out.println("Excellent performance");
        } else if (grade.equalsIgnoreCase("B")) {
            System.out.println("Good performance");
        } else if (grade.equalsIgnoreCase("C")) {
            System.out.println("Average performance");
        } else if (grade.equalsIgnoreCase("D") ){
            System.out.println("Below Average performance");
        } else{
            System.out.println("Fail");
        }
    }

    public void switchCaseExample(){
        /*
        switch(variable){
            case value1:
                // code to be executed if variable == value1
                break;
            case value2:
                // code to be executed if variable == value2
                break;
            ...
            default:
                // code to be executed if variable doesn't match any case
        }
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number (1-7): ");
        int day= sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }
    }
    // design  grade system using switch case
    public void gradeUsingSwitchcase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade (A, B, C, D): ");
        String grade= sc.nextLine();

        switch(grade.toUpperCase()){
            case "A":
                System.out.println("Excellent performance");
                break;
            case "B":
                System.out.println("Good performance");
                break;
            case "C":
                System.out.println("Average performance");
                break;
            case "D":
                System.out.println("Below Average performance");
                break;
            default:
                System.out.println("Fail");
                break;
        }
    }

}
