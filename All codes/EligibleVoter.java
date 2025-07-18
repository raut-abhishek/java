import java.util.*;

public class EligibleVoter {
    public static void EligibilityCalculator(int a) {
        if (a >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age = ");
        int a = sc.nextInt();
        EligibilityCalculator(a);
    }
}
