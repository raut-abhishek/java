// selection sort an array

public class AsscendingSort {

    public static void printArray(int[] arr){
        for(int n : arr){
            System.out.print(n + " ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {7,8,3,2,1};
        
        for(int  i = 0; i<arr.length-1; i++){
            int small  = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[small]>arr[j]){
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
            

        }
        printArray(arr);
    }
}
