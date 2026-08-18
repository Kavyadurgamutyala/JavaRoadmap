package Day05_Objects;
public class CarObject {

    String brand;
    int model;
    int price;

    void display() {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }

    public static void main(String[] args) {

        CarObject c = new CarObject();

        c.brand = "BMW";
        c.model = 22;
        c.price = 60000;

        c.display();
    }
}