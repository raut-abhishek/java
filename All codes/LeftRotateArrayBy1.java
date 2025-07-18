// Rotate the array to the left by one position.
public class LeftRotateArrayBy1 {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50, 60 };
        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }
    }
}
