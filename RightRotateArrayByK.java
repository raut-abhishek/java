//Rotate the array to the right by k positions
public class RightRotateArrayByK {
    public static void main(String[] args) {
        int k = 2;
        int a = 1;
        int[] arr = { 10, 20, 30, 40, 50 };
        while (a <= k) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            a++;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
