package Day08_Inheritance;

class Vehicle {

    String brand = "BMW";

    void start() {
        System.out.println("Vehicle Started");
    }
}

public class VehicleCar extends Vehicle {

    public static void main(String[] args) {

        VehicleCar c = new VehicleCar();

        System.out.println(c.brand);

        c.start();
    }
}