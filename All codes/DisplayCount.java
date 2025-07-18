import java.util.*;

public class DisplayCount {// enter the numbers till user wants and at the end it should display the count
                           // of positive, negative and zero entered
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int PositiveCount = 0;
        int NegativeCount = 0;
        int ZeroCount = 0;
        char choice;
        do {
            System.out.print("Enter a number = ");
            int a = sc.nextInt();
            if (a > 0) {
                PositiveCount++;
            } else if (a < 0) {
                NegativeCount++;
            } else {
                ZeroCount++;
            }
            System.out.print("Do you want to continue? (yes/no) : ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
        System.out.println("Positive numbers entered : " + PositiveCount);
        System.out.println("Negative numbers entered : " + NegativeCount);
        System.out.println("Zero's entered : " + ZeroCount);
    }
}
