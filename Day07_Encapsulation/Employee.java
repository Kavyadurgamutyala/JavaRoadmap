package Day07_Encapsulation;
public class Employee {

    private int id;
    private String name;
    private int salary;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        Employee e = new Employee();

        e.setId(101);
        e.setName("Kavya");
        e.setSalary(60000);

        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}