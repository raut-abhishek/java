// print numbers from n to 1 
public class printingNumbers {

    public static void printNumbers(int n) {
        if (n == 0) return;
        System.out.println(n);
        printNumbers(n - 1);
    }
    public static void main(String[] args) {
        printNumbers(5);
    }
}
