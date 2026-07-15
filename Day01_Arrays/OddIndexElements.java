class OddIndexElements {
    public static void main(String[] args) {
        int arr[] = {5, 10, 15, 20, 25, 30};

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}