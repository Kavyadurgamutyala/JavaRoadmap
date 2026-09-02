package Day09_Polymorphism;
class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
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