package Day14_HashMap;
import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Kavya");
        map.put(2, "Rahul");
        map.put(3, "Priya");

        System.out.println(map);
    }
}