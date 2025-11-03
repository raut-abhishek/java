package recursion;

public class Power {

    public static int getPower(int n, int p){
        if(p == 0) return 1;
        return n * getPower(n, p-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int p = 4;
        System.out.println(getPower(n,p));
    }
}
