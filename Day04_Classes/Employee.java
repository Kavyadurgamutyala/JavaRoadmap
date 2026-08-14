package Day04_Classes;

class Employee {

    String employeeName = "Kavya";
    int employeeId = 22;
    int salary = 60000;

    void display() {
        System.out.println(employeeId);
        System.out.println(employeeName);
        System.out.println(salary);
    }

    public static void main(String[] args) {

        Employee e = new Employee();

        e.display();
    }
}
