package Day04_Classes;
class Student {

    String name = "Kavya";
    int age = 22;

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {

        Student s = new Student();

        s.display();
    }
}