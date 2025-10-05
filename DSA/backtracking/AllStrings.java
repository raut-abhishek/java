// Generating All Strings of Length N

public class AllStrings {
    static void generate(String prefix, int n) {
        if (n == 0) {
            System.out.println(prefix);
            return;
        }

        generate(prefix + "a", n - 1);
        generate(prefix + "b", n - 1);
    }

    public static void main(String[] args) {
        generate("", 3);
    }
}
