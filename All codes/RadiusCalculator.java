import java.util.*;

public class RadiusCalculator {
    public static void CalculateRadius(double a) {
        double area = Math.PI * a * a;
        System.out.println("Area of a circle with radius " + a + " is = " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of a circle = ");
        double a = sc.nextDouble();
        CalculateRadius(a);

    }
}
