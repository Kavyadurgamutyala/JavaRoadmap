class ArrayMax {
    public static void main(String[] args) {
        int arr[] = {12, 45, 7, 89, 23};
        int max = arr[0];

        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }

        System.out.println(max);
    }
}