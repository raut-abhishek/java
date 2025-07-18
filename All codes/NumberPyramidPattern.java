// import java.util.*;

public class NumberPyramidPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // First spaces
            int FirstSpaces = n - i;
            for (int j = 1; j <= FirstSpaces; j++) {
                System.out.print(" ");
            }
            // Numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
    }
}