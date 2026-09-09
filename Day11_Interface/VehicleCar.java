package Day11_Interface;
interface Vehicle {

    void start();

}

public class VehicleCar implements Vehicle {

    public void start() {
        System.out.println("Car Started");
    }

    public static void main(String[] args) {

        VehicleCar c = new VehicleCar();

        c.start();

    }
}