package Day07_Encapsulation;
public class Mobile {

    private String brand;
    private int price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {

        Mobile m = new Mobile();

        m.setBrand("Samsung");
        m.setPrice(25000);

        System.out.println(m.getBrand());
        System.out.println(m.getPrice());
    }
}