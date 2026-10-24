import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); // stores next greater for each element in nums2
        Stack<Integer> stack = new Stack<>();

        // Process nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], stack.peek());
            }

            stack.push(nums2[i]);
        }

        // Build result for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}

public class NextGreaterElement {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] ans = sol.nextGreaterElement(nums1, nums2);
        System.out.println("Input nums1: " + Arrays.toString(nums1));
        System.out.println("Input nums2: " + Arrays.toString(nums2));
        System.out.println("Next Greater Elements: " + Arrays.toString(ans));
    }
}
