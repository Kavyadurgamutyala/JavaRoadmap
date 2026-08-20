package Day08_Inheritance;

class Person {

    String name = "Kavya";
}

public class PersonStudent extends Person {

    public static void main(String[] args) {

        PersonStudent s = new PersonStudent();

        System.out.println(s.name);
    }
}