package Day05_Objects;

public class StudentObject {

    String name;
    int age;

    void display() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {

        StudentObject s = new StudentObject();

        s.name = "Kavya";
        s.age = 22;

        s.display();
    }
}