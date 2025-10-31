import java.util.*;

public class PowerCalculator {
    public static void CalculatePower(int base, int exponent) {
        double exponentiation = Math.pow(base, exponent);
        System.out.print(base + " raised to the power of " + exponent + " is : " + exponentiation);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int base = sc.nextInt();
        System.out.print("Enter power : ");
        int exponent = sc.nextInt();
        CalculatePower(base, exponent);
        sc.close();
    }
}
