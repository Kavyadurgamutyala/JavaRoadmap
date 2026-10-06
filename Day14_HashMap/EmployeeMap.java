package Day14_HashMap;
import java.util.HashMap;

public class EmployeeMap {

    public static void main(String[] args) {

        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(1, "Kavya");
        employees.put(2, "Rahul");

        System.out.println(employees.containsKey(1));

        System.out.println(employees.size());
    }
}