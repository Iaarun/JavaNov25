package abstractdemo;

public abstract class Vehicle {
    //abstract methods
    // abstract function cannot be static
    //abstract classes cannot be instantiated
    //abstract methods must be implemented in derived classes
    //abstract function cannot be private
    public abstract void accelerate();
    public abstract void brake();

    //concrete method
    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }

}
