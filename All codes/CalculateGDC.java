import java.util.*; //Greatest Common Divisor Calculator

public class CalculateGDC {
    public static int GDCcalculator(int a, int b) {
        while (b != 0) {
            int i = b;
            b = a % b;
            a = i;

        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enterr first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int c = GDCcalculator(a, b);
        System.out.println("Greatest Common Divisor of " + a + " & " + b + " is " + c);
    }

}
