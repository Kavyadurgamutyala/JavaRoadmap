package Day01_Arrays;
class CountOdd {
    public static void main(String[] args) {
        int arr[] = {2, 7, 9, 12, 15, 20};
        int count = 0;

        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}