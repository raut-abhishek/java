// Binary search on array using recursion
public class binarySearch {

    public static int findTarget(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return findTarget(arr, target, mid + 1, end);
        } else {
            return findTarget(arr, target, start, mid - 1);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 100 };
        int target =55;
        int result = findTarget(arr, target, 0, arr.length - 1);
        if (result != -1) {
            System.out.println("Target " + target + " found at index " + result);
        } else {
            System.out.println("Target not found");
        }

    }
}
