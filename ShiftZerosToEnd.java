// Shift all zeros to the end of the array.
public class ShiftZerosToEnd {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 0, 3, 0, 4 };
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int j = index; j < nums.length; j++) {
            nums[j] = 0;
        }
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}
