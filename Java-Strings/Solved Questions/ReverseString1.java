//  Reverse a string manually using a loop

public class ReverseString1 {
    public static void main(String[] args) {
        String original = "abhishek";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);                     // this Adds each character to reversed
        }

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
