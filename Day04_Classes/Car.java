package Day04_Classes;
class Car {

    String brand = "BMW";
    int model = 22;
    int price = 60000;

    void display() {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }

    public static void main(String[] args) {

        Car c = new Car();

        c.display();
    }
}