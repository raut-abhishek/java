// Generate All Binary Strings of Length n

public class BinaryStrings {

    public static void generateBinary(int n, String str) {
        if (str.length() == n) {
            System.out.println(str);
            return;
        }

        generateBinary(n, str + "0");

        generateBinary(n, str + "1");
    }

    public static void main(String[] args) {
        int n = 3;
        generateBinary(n, "");
    }
}
