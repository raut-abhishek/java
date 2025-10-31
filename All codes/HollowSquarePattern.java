import java.util.*;

public class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= m; b++) {
                if (a == 1 || b == 1 || a == n || b == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}