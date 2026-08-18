package Day05_Objects;
public class EmployeeObject {

    String employeeName;
    int employeeId;
    int salary;

    void display() {
        System.out.println(employeeId);
        System.out.println(employeeName);
        System.out.println(salary);
    }

    public static void main(String[] args) {

        EmployeeObject e = new EmployeeObject();

        e.employeeName = "Kavya";
        e.employeeId = 22;
        e.salary = 60000;

        e.display();
    }
}
     
