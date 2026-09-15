package Day13_Collections;
import java.util.ArrayList;

public class StudentList {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Kavya");
        students.add("Rahul");
        students.add("Priya");
        students.add("Akhil");
        students.add("Sneha");

        for (String student : students) {
            System.out.println(student);
        }
    }
}