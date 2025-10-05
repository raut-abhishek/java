// Generating All Permutations of an Array

import java.util.*;

public class ArrayPermutations {
     static void backtrack(int[] nums, List<Integer> current, boolean[] used) {

        if (current.size() == nums.length) {
            System.out.println(current);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            current.add(nums[i]);
            used[i] = true;

            backtrack(nums, current, used);

            //Backtrack
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        backtrack(nums, new ArrayList<>(), new boolean[nums.length]);
    }
}
