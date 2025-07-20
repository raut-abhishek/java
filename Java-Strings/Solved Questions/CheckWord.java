//Check if a string contains a specific word
public class CheckWord {
    public static void main(String[] args) {
        String sentence = "Java is a great programming language.";
        String word = "great";

        if (sentence.contains(word)) {
            System.out.println("The sentence contains the word: " + word);
        } else {
            System.out.println("The word is not present.");
        }
    }
}
