package Day06_Constructors;
public class Mobile {

    String brand;
    int ram;
    int price;

    Mobile(String brand, int ram, int price) {

        this.brand = brand;
        this.ram = ram;
        this.price = price;

    }

    void display() {

        System.out.println(brand);
        System.out.println(ram);
        System.out.println(price);

    }

    public static void main(String[] args) {

        Mobile m = new Mobile("Samsung", 8, 25000);

        m.display();

    }
}