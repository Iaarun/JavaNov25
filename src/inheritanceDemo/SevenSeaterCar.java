package inheritanceDemo;

public class SevenSeaterCar extends Car {

    public void seatCapacity(){
        System.out.println("This car can seat 7 people");
    }

    public static void main(String[] args) {

        SevenSeaterCar suv = new SevenSeaterCar();
        suv.seatCapacity(); // Method from SevenSeaterCar class
        suv.start(); // Inherited method from Vehicle class
        suv.stop(); // Inherited method from Vehicle class

    }
}
