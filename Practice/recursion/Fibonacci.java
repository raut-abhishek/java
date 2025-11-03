package recursion;

public class Fibonacci {

    public static int getFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(getFibonacci(n));

    }
}