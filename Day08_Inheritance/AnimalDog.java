package Day08_Inheritance;
class Animal {

    void eat() {
        System.out.println("Animal is Eating");
    }
}

public class AnimalDog extends Animal {

    public static void main(String[] args) {

        AnimalDog d = new AnimalDog();

        d.eat();
    }
}