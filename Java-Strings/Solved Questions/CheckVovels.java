// Count the number of vowels in a string.

public class CheckVovels {
    public static void main(String[] args) {
        String word = "abhishek";
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            char temp = word.charAt(i);
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
                counter++;

            }
        }
        System.out.println(word + " contains " + counter + " vovels");
    }
}
