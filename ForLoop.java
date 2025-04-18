import java.util.*;
public class ForLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number that you want to print 5 tmes = ");
            int num = sc.nextInt();
        for(int a = 1; a<=5; a++){
            System.out.println(num);
        }
    }
    
}
