import java.util.*;

public class SolidRombusPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            // Spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for(int j =1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
