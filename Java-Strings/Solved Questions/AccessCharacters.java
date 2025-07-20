// Access the first and last characters of a string.
public class AccessCharacters {
    public static void main(String[] args) {
        String str = "Abhishek";

        if (str.length() > 0) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);

            System.out.println("First character: " + firstChar);
            System.out.println("Last character: " + lastChar);
        } else {
            System.out.println("The string is empty.");
        }
    }
}
