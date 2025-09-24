// Josephus Problem (circle elimination)
public class JosephusProblem1 {

    public static int josephus(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (josephus(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int survivor = josephus(n, k) + 1;

        System.out.println("The safe position is: " + survivor);
    }
}
