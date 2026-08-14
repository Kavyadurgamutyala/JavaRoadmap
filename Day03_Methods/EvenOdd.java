package Day03_Methods;

public class EvenOdd {

    public static void evenOdd(int a) {

        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

    public static void main(String[] args) {
        evenOdd(14);
    }
}