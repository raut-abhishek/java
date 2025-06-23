import java.util.*;

public class AverageFunction {
    public static void CalculateAverage(int a, int b, int c) {
        System.out.println("Average = "+((a+b+c)/3));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int a = sc.nextInt();
        System.out.print("Enter second number = ");
        int b = sc.nextInt();
        System.out.print("Enter third number = ");
        int c = sc.nextInt();
        CalculateAverage(a, b, c);
    }
}
