
// Find the maximum number in the array
import java.util.*;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to enter : ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Number "+(i+1)+" : ");
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        System.out.print("The maximum number is ; " + numbers[n-1] + ".");        
        sc.close();
    }
}
