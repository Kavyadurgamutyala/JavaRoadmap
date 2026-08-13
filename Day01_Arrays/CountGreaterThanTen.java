package Day01_Arrays;
class CountGreaterThanTen {
    public static void main(String[] args) {
        int arr[] = {4, 15, 9, 22, 10, 31};
        int count = 0;

        for (int num : arr) {
            if (num > 10) {
                count++;
            }
        }

        System.out.println(count);
    }
}