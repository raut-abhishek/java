// recursion
// recursion is besically the function calls itself
public class recursion {
     public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Done!");
        } else {
            System.out.println(n);
            countdown(n - 1); // recursive call
        }
    }

    public static void main(String[] args) {
        countdown(5);
    }
}