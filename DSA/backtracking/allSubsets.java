// recursion and backtracking
import java.util.ArrayList;

public class allSubsets{

    public static void printSubsets(int[] arr, ArrayList<Integer> ans, int i){
        if(i == arr.length){
            System.out.println(ans);
            return;
        }

        // include element
        ans.add(arr[i]);
        printSubsets(arr, ans, i+1);

        // backtrack
        ans.remove(ans.size() - 1);

         // exclude arr[i]
        printSubsets(arr, ans, i + 1);
        
    }

    public static void main(String[] args){
        int[] arr = {1,2,3};
         ArrayList<Integer> ans = new ArrayList<>();
        printSubsets(arr, ans, 0);
    }
}