package inheritanceDemo;
//inheritance: when a class acquires the properties (methods and fields) of another class
//private members are not inherited

// Single inheritance: when a class inherits another class
public class Dog extends Animal {

    public void bark(){
        System.out.println("Dog is barking");
    }

public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark();  // Method from Dog class
        dog.eat();   // Inherited method from Animal class
        dog.sleep(); // Inherited method from Animal class

}

}
