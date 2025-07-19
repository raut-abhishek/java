// Check if a string contains a specific word
public class FindWordInString {
    public static void main(String[] args) {
        String sentence = "Hello Abhishek, how are you today?";
        String word = "abhishek";

        boolean contains = sentence.toLowerCase().contains(word.toLowerCase());

        if (contains) {
            System.out.println("The word \"" + word + "\" is found.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT found.");
        }
    }
}
