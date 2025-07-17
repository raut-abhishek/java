//  Merge two arrays into one
public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 0, 1, 2 };
        int[] arr2 = { 3, 4, 5, 6 };
        int n = arr1.length + arr2.length;
        int[] mergedArr = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            mergedArr[j + arr1.length] = arr2[j];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(mergedArr[i] + " ");
        }
    }
}
