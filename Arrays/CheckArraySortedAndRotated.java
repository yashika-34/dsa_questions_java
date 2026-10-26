package Arrays;

public class CheckArraySortedAndRotated {

    public static boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 1, 2};
        int[] arr2 = {2, 1, 3, 4};

        System.out.println("Is [3, 4, 5, 1, 2] sorted and rotated? " + check(arr1)); // true
        System.out.println("Is [2, 1, 3, 4] sorted and rotated? " + check(arr2));       // false
    }
}