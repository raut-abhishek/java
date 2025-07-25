public class SubstringExample {
    public static void main(String[] args) {
        String input = "abhishek";
        int i = 2;
        int j = 6;

        // Extract substring from index i (inclusive) to j (exclusive)
        String result = input.substring(i, j);

        System.out.println("Substring from index " + i + " to " + (j - 1) + ": " + result);
    }
}

