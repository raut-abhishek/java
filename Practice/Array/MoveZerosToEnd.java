public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {6,0,1,0,2,3,0,4,5};
        int index = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;  
            }
        }
        for(int j = index; j<arr.length; j++){
            arr[j] = 0;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
        
    }
}
