package testpackage;

public class _007Strings {
    public static void main(String[] args) {

        _007Strings stringObj = new _007Strings();
        stringObj.stringFunctions();
    }

    public void createStrings(){
        //String claas in java is used to store sequence of characters and its immutable
        //two ways to create string
        //1. using string literal
        String str1 = "Hello World";
        String str3 = "Hello World";// stored in string pool
        //2. using new keyword
        String str2 = new String("Hello Java");// stored in heap memory
        String str4 = new String("Hello Java");
   // in case of string , == operator compares the references not the actual content
        if(str1==str4){
            System.out.println(" references are same");
        }else{
            System.out.println(" references are different");
        }
    }

    public void immutableStringExample(){
        String original = "Hello";
        original=   original.concat(" world!!");
        System.out.println("Original String after concat: " + original);

    }

    public void stringFunctions(){
        String sample = "Hello World";
        // Length of the string
        System.out.println("Length: " + sample.length());
        System.out.println(sample);
        //trim
        System.out.println("Trimmed: '" + sample.trim() + "'");
        //uppercase
        System.out.println("Uppercase: " + sample.toUpperCase());
        //lowercase
        System.out.println("Lowercase: " + sample.toLowerCase());
        // WAP to convert the string in to titlecase  hello world = Hello World
        //get char at index
        System.out.println("Character at index 4: " + sample.charAt(0));
        //substring
        System.out.println("Substring (0): " + sample.substring(1));
        System.out.println("Substring (0,5): " + sample.substring(0, 5));
        // input : xyz12@gmail.com    output : xyz
        String email= "xyzjcvxhkdsbvksjbvksbjvksbvkbsj@gmail.com";
        String username= email.substring(0, email.indexOf('@'));
        System.out.println("Username extracted from email: "+username);


        //replace

    }

}
