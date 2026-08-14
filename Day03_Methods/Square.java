package Day03_Methods;

public class Square {

    public static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        int result = square(10);
        System.out.println(result);
    }
}