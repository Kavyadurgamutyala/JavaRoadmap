package Day01_Arrays;
class ArraySearch {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int target = 20;
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}