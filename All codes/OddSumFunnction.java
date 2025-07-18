public class OddSumFunnction {
    public static void PrintOddSum(int a) {
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of all odd numbers from 1 to "+a+" is = " + sum);
    }

    public static void main(String[] args) {
        int n = 50;
        PrintOddSum(n);
    }
}