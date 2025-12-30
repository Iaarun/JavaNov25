package inheritanceDemo;

public class FiveSeaterCar extends Car {
    public void seatCapacity(){
        System.out.println("This car has a seating capacity of five.");
    }

    public static void main(String[] args) {
        FiveSeaterCar sedan = new FiveSeaterCar();
        sedan.seatCapacity(); // Method from FiveSeaterCar class
        sedan.start(); // Inherited method from Vehicle class
        sedan.honk(); // Inherited method from Car class
        sedan.stop(); // Inherited method from Vehicle class
    }
}
