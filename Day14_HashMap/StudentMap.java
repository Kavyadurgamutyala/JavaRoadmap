package Day14_HashMap;
import java.util.HashMap;

public class StudentMap {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Kavya");
        students.put(102, "Rahul");
        students.put(103, "Sneha");

        System.out.println(students.get(101));
    }
}