package abstractdemo;

public class RaceCar extends Vehicle {

    @Override
    public void accelerate() {
        System.out.println("RaceCar is accelerating 0-100 in 3sec.");
    }

    @Override
    public void brake() {
        System.out.println("RaceCar is braking with ABS.");
    }
}
