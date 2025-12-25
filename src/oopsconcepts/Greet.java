package oopsconcepts;

public class Greet {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.sayHello();
        obj.sayHello("Arun");
       String text= obj.sayHelloReturn("John");
        System.out.println(text);
    }

    public void sayHello(){
        System.out.println("Hello! Welcome to OOP Concepts.");
    }

    public void sayHello(String name){
        System.out.println("Hello " + name + "! Welcome to OOP Concepts .");
    }

    public String sayHelloReturn(String name){
        return "Hello " + name + "! Welcome to OOP Concepts.";
    }
}
