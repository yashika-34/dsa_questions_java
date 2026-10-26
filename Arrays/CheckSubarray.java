package Arrays;

public class CheckSubarray {

    public static boolean checkSubarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                if (sum % k == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        System.out.println("Has subarray multiple of " + k + ": " + checkSubarraySum(nums, k)); // true (2+4=6)
    }
}