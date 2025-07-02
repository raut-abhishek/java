
//  Store 5 numbers and print only even numbers.
import java.util.*;

public class ArrayQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five numbers : ");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + " = ");
            numbers[i] = sc.nextInt();
        }
        System.out.print("Even numbers are : ");
        for (int i = 0; i < 5; i++) {
            int n = numbers[i];
            if (n % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        sc.close();
    }
}
