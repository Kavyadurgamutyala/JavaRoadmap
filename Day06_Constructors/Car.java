package Day06_Constructors;
public class Car {

    String brand;
    int price;

    Car(String brand, int price) {

        this.brand = brand;
        this.price = price;

    }

    void display() {

        System.out.println(brand);
        System.out.println(price);

    }

    public static void main(String[] args) {

        Car c = new Car("BMW", 6000000);

        c.display();

    }
}
