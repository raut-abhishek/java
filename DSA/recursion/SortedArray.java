// Check the array sorted or not

public class SortedArray {

    public static Boolean CheckSorted(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return true;
        }
        return ((arr[n - 2] <= arr[n - 1]) && CheckSorted(arr, n - 1));

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        Boolean result = CheckSorted(arr, n);
        if (result == true) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
