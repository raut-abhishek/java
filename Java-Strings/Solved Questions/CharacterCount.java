//  Find the frequency of each character in a string.

public class CharacterCount {
    public static void main(String[] args) {
        String name = "Abhishek";
        int[] counter = new int[256];         // Creates an integer array of size 256 to store frequency of each ASCII character (0–255)
        name = name.toLowerCase();

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            counter[ch]++;
        }

        for (int j = 0; j < counter.length; j++) {
            if (counter[j] > 0) {
                System.out.println((char) j + " : " + counter[j]);
            }
        }
    }
}
