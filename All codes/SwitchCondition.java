import java.util.*;
public class SwitchCondition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a number from 1,2,3,4");
        int num = sc.nextInt();
        switch (num) {
            case 1: System.out.println("Hello");
                break;
            case 2: System.out.println("Nmaste");
                break;
            case 3: System.out.println("Good Morning");
                break;
            case 4: System.out.println("Good Afternoon");
                break;
            default:System.out.println("you must choose a number from 1 to 4");
                break;
        }
    
    }
}
