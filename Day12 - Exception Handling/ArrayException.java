public class ArrayException {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        try {

            System.out.println(arr[5]);

        } catch (Exception e) {

            System.out.println("Array Index Out Of Bounds Exception Handled");

        }

    }
}