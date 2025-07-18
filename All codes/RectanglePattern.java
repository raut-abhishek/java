import java.util.*;
public class RectanglePattern {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        int a = sc.nextInt();
        System.out.println("Enter breadth of rectangle");
        int b = sc.nextInt();
        for(int c= 1; c<=b; c++){
            for(int d = 1; d<=a; d++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
