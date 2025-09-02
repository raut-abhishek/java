// Check array is sorted using recursion
public class CheckSortedArray {

    public static boolean isSorted(int[]arr, int n){
        if(n==0 || n==1) return true;

        return ((arr[n-1]>arr[n-2]) && isSorted(arr, n-1));
    }
    public static void main(String[] args) {
        int[] arr = {10,2,3,4,5};
        int n = 5; 
        System.out.println(isSorted(arr, n));
    }
}
