package Day06_Constructors;
public class Employee {

    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    void display() {

        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);

    }

    public static void main(String[] args) {

        Employee e = new Employee(101, "Kavya", 60000);

        e.display();

    }
}