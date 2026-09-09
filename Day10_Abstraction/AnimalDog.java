package Day10_Abstraction;
abstract class Animal {

    abstract void sound();

}

public class AnimalDog extends Animal {

    void sound() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {

        AnimalDog d = new AnimalDog();

        d.sound();
    }
}
