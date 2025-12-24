package testpackage;

import java.util.Arrays;

public class _007Strings {
    public static void main(String[] args) {

        _007Strings stringObj = new _007Strings();
        stringObj.reverseaString();
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
        //trim to remove leading and trailing spaces
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
        //indexOf
        System.out.println("Index of 'l': " + sample.indexOf('l'));
        //lastIndexOf
        System.out.println("Last Index of 'l': " + sample.lastIndexOf('l'));
        //contains
        System.out.println("Contains 'World': " + sample.contains("world"));
        //equals
        System.out.println("Equals 'Hello World': " + sample.equals("Hello World"));
        //equalsIgnoreCase
        System.out.println("Equals Ignore Case 'hello world': " + sample.equalsIgnoreCase("hello world"));
       // compareTo
        System.out.println("Compare to 'Hello Java': " + sample.compareTo("Hello java"));
        //compareToIgnoreCase
        System.out.println("Compare to Ignore Case 'hello java': " + sample.compareToIgnoreCase("hello world"));
        // replace
        System.out.println("Replace 'World' with 'Java': " + sample.replace("World", "Java"));
        System.out.println(sample.replace(" ",""));

        //split
        String str = "apple,banana,cherry";
        String[] fruits= str.split("banana");
        System.out.println("Fruits:");
        for(String fruit: fruits) {
            System.out.println(fruit);
        }
         char[] arr=  sample.toCharArray();
        System.out.println(Arrays.toString(arr));

        System.out.println(sample.startsWith("ello"));
        System.out.println(sample.endsWith("ld"));

        // isEmpty
        String emptyStr= "";
        System.out.println("Is empty string: "+ emptyStr.isEmpty());
    }

    //iterate of string characters
    public void iterateStringCharacters() {
        String str = "Hello";
        for (int i = 0; i <= str.length() - 1; i++) {
            System.out.println("Character at index " + i + " is: " + str.charAt(i));
        }

    }
    public void reverseaString(){
        String str = "Hello";  // olleH
        String reversed = "";
        for(int i=str.length()-1;i>=0; i--){
            reversed += str.charAt(i);
        }
        System.out.println("Reversed String: "+reversed);

        String rev="";
        for(int i=0; i<=str.length()-1;i++){

            rev= str.charAt(i)+rev;

        }
        System.out.println("Reversed String: "+rev);
    }

    public void createStringusingStringBuilder(){
        StringBuilder sb= new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder after append: "+ sb.toString());

        sb.insert(5, ",");
        System.out.println("StringBuilder after insert: "+ sb.toString());

        sb.replace(0,5,"Hi");
        System.out.println("StringBuilder after replace: "+ sb.toString());

        sb.delete(2,3);
        System.out.println("StringBuilder after delete: "+ sb.toString());

        sb.reverse();
        System.out.println("StringBuilder after reverse: "+ sb.toString());
    }

    //StringBuilder and StringBuffer  - mutable strings

    //String palendrome check
    //  level

    //Anagram
    //listen  silent
}
