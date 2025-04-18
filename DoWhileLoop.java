import java.util.*;
public class DoWhileLoop {
    public static void main(String[] args){
        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i++;

        // }while(i<=6);

        int n = 4;
        int sum=0;
        for(int i = 0; i<=n;i++){
            sum=sum + i;
        }
        System.out.println(sum);
    }
}
