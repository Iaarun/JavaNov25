package abstractdemo;

public class SedanCar extends Vehicle {



    public static void main(String[] args) {
        //abstract class cannot be instantiated
      //  Vehicle myCar = new Vehicle();

    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating 0-100 in 10sec.");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking without ABS.");
    }
}
