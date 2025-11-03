public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10,42,23,4,15,6};
        int large = arr[0];
        int small = arr[0];
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]> large){
                large = arr[i];
            }
            if(arr[i]< small){
                small = arr[i];
            }
        }
        System.out.println(large);
        System.out.println(small);
    }
}
