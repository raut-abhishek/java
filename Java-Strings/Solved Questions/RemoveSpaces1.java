// Trim leading and trailing spaces from a string
public class RemoveSpaces1 {
    public static void main(String[] args) {
        String input = "   Hello Abhishek   ";         //here string has spaces to front and rear

        String trimmed = input.trim();                  //.trim() removes leading and trailing spaces but not middle spaces

        System.out.println("Original: [" + input + "]");
        System.out.println("Trimmed : [" + trimmed + "]");
    }
}
