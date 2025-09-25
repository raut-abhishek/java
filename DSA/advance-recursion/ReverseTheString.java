// Reverse a String

public class ReverseTheString {

    public static String reverse(String s) {
        if (s.length() <= 1) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String str = "abhishek";
        System.out.println("Actual: " + str);
        System.out.println("Reversed: " + reverse(str));
    }
}
