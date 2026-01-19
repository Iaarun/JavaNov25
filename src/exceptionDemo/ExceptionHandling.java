package exceptionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

    public static void main(String[] args) {
        ExceptionHandling demo = new ExceptionHandling();
     //   demo.basicExceptionHandling();
        demo.testAge();
    }

    public void basicExceptionHandling() {
        System.out.println("Start of method");
        int num = 10;
        int num2 = 5;
        int dividedResult=0;
     try{
          dividedResult = num/num2;
     }catch (ArithmeticException e){
         e.printStackTrace();
     }
        System.out.println("Result: " + dividedResult);

     try {
         String name = "kjhgjk";
         System.out.println(name.length());
     }
     catch (NullPointerException e){
            e.printStackTrace();
     }catch (Exception e){
         System.out.println("Generic exception caught");
     }finally {
         System.out.println("Inside finally block");
     }


        System.out.println("End of  method");
    }

    public void compiletimeExeption() throws FileNotFoundException {
        // two ways to handle checked exceptions: try-catch or throws keyword
        // use either try-catch block or throws keyword
        File file = new File("test.txt");
        FileInputStream fis;
        /*
        try{
            fis = new FileInputStream(file);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        */
        fis = new FileInputStream(file); //throws FileNotFoundException
    }

    public void testAge(){
        ValitdateAge validator = new ValitdateAge();
        validator.validateAge(17);
    }

    public void testMyAge() throws InValidAgeException {
        ValitdateAge validator = new ValitdateAge();
            validator.validateMyAge(16);

    }
}
