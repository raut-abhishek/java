import java.util.*;

public class FactorialFunction {
    public static void PrintFactorial(int a) {
        if (a < 0) {
            System.out.println("please enter a valid number");
            return;

        }
        int factorial = 1;
        for (int i = a; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial = " + factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int a = sc.nextInt();
        PrintFactorial(a);
        sc.close();
    }
}
