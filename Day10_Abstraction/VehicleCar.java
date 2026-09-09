package Day10_Abstraction;
abstract class Vehicle {

    abstract void start();

}

public class VehicleCar extends Vehicle {

    void start() {
        System.out.println("Car Started");
    }

    public static void main(String[] args) {

        VehicleCar c = new VehicleCar();

        c.start();
    }
}