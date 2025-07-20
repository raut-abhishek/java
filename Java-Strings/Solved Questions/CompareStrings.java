//Compare two strings with and without case sensitivity.
public class CompareStrings {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "hello";

        if (string1.equalsIgnoreCase(string2)) {        //.equalsIgnoreCase compares striings without case sensitivity
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are NOT equal");
        }
    }
}
