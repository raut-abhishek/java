import java.util.*;
public class MultiplicationFunction { 
    public static void Multiplication(int a,int b){
        System.out.println("Multiplication = "+(a*b));
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int a = sc.nextInt();
        System.out.print("Enter second number = ");
        int b = sc.nextInt();
        Multiplication(a, b);
        sc.close();

    }
}
