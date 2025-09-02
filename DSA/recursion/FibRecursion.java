// fibonacci using recursion

import java.util.Scanner;

public class FibRecursion {

    public static int getFibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        return getFibonacci(n - 1) + getFibonacci(n - 2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter term number: ");
        int n = sc.nextInt();
        System.out.println(getFibonacci(n));
        sc.close();
    }

}