package Arrays;

import java.util.Arrays;

public class RunningSum {

    public static int[] runningSum(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        return prefix;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Running Sum: " + Arrays.toString(runningSum(nums))); // [1, 3, 6, 10]
    }
}