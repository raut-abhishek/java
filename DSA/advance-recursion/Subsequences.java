// Generate all subsequences of a string using recursion

public class Subsequences {

    public static void generateSubsequences(String str, int index, String current) {

        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        generateSubsequences(str, index + 1, current + str.charAt(index));

        generateSubsequences(str, index + 1, current);
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println("All subsequences:");
        generateSubsequences(s, 0, "");
    }
}
