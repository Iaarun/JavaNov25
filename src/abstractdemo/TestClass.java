package abstractdemo;

public class TestClass {

    public static void main(String[] args) {
        Vehicle myRaceCar = new RaceCar();
        myRaceCar.startEngine();
        myRaceCar.accelerate();
        myRaceCar.brake();
        myRaceCar.stopEngine();


        Vehicle mySedanCar = new SedanCar();
        mySedanCar.startEngine();
        mySedanCar.accelerate();
        mySedanCar.brake();
        mySedanCar.stopEngine();
    }
}
