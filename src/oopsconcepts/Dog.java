package oopsconcepts;

// Create Student class with attributes name, age, grade and a method study() that prints "<name> is studying".
/*
 Fucntions are bock of code which performs specific task
 use:
  code resuability
  modular code
  easy to debug
 easy to maintain
 function syntax
 accessmodifier static/nonstatic  returnType functionName(parameter1, parameter2,...){
        // code to be executed
        return value; // if returnType is not void
    }
 */
public class Dog {
    // attributes / properties of dog
    String name;
    String breed;
    int age;
    String color;

    // function shows behavior of dog
    public void barking(){
        System.out.println(name+" is barking");
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + ", color=" + color + "]";
    }


    public static void main(String[] args) {
        //create object of the Dog class
        Dog dog1 = new Dog();
        //assign values to the properties
        dog1.name = "Buddy";
        dog1.breed = "Golden Retriever";
        dog1.age = 3;
        dog1.color = "Golden";
        //call the barking method
        dog1.barking();
        System.out.println("Dog1 info: "+dog1.toString());

        // another object of Dog class
     Dog dog2 =  new Dog();
        dog2.name = "Max";
        dog2.breed = "German Shepherd";
        dog2.age = 4;
        dog2.color = "Black and Tan";
        dog2.barking();
        System.out.println("Dog2 info: "+dog2.toString());

        //object cloning
        /*
       try {
           Dog dog3 = (Dog) dog1.clone();
           System.out.println("Dog3 info (cloned from Dog1): "+dog3.toString());
       }catch (CloneNotSupportedException e) {
           e.printStackTrace();
       }
       */


    }



}
