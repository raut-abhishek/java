// binary search on array using recursion
public class BinarySearch {

    public static int getTarget(int[] arr, int target, int start, int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return getTarget(arr, target, mid + 1, end);
            } else {
                return getTarget(arr, target, start, mid - 1);
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
        int target = 88;
        System.out.println(getTarget(arr, target, 0, arr.length));
    }
}
