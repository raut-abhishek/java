import java.util.*;
public class AdditionFinction {
    public static void Addition(int a,int b){
        System.out.println("Addition = "+(a+b));
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int a = sc.nextInt();
        System.out.print("Enter second number = ");
        int b = sc.nextInt();
        Addition(a, b);

        sc.close();
    }
}
