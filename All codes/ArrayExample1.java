import java.util.*;
public class ArrayExample1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size= sc.nextInt();
        int [] numbers = new int[size];
        int a = 0;
        while(a< numbers.length){
            System.out.print("Enter " + a + ": ");
            numbers[a] = sc.nextInt();
            a++;
        }
        System.out.print("Your array is: ");
        for(int i = 0; i< numbers.length; i++){
            System.out.print(" ");
            System.out.print(numbers[i]);
        }
        sc.close();
        
    }
}
