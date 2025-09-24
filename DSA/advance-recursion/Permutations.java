// String permutations using recursion

public class Permutations {
    
    public static void permute(char[] str, int left, int right) {
        if (left == right) {
            System.out.println(new String(str));
            return;
        }

        for (int i = left; i <= right; i++) {
            swap(str, left, i);
            permute(str, left + 1, right);
            swap(str, left, i);
        }
    }

    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String[] args) {
        String s = "ABC";
        char[] arr = s.toCharArray();
        System.out.println("All permutations:");
        permute(arr, 0, arr.length - 1);
    }
}
