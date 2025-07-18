public class InvertedHalfPyramid2 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) { // This is for outer loop
            for (int j = 1; j <= n - i; j++) { // ineer loop for space
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // loop fot star
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
