//Find the sum of all elements in an array
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to enter : ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + " = ");
            numbers[i] = sc.nextInt();
        }
        System.out.print("Sum of the all numbers : ");
        int sum = 0;
        for(int i = 0; i<n; i++){
            
            sum += numbers[i];
        }
        System.out.print(sum);   
        sc.close();    
    }
}
