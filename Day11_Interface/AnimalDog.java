package Day11_Interface;
interface Animal {

    void sound();

}

public class AnimalDog implements Animal {

    public void sound() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {

        AnimalDog d = new AnimalDog();

        d.sound();

    }
}