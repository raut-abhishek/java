import java.util.*;

public class GreaterOfTwoFunction {
    public static void GreaterOfTwo(int a, int b) {
        if (a == b) {
            System.out.println("Both numbers are equal.");
            return;
        } else if (a > b) {
            System.out.println(a + " is grater.");
            return;
        } else {
            System.out.println(b + " is grater.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int a = sc.nextInt();
        System.out.print("Enter second number = ");
        int b = sc.nextInt();
        GreaterOfTwo(a, b);
    }

}
