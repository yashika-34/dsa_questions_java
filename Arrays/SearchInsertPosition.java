package Arrays;

public class SearchInsertPosition {

    /**
     * Binary Search implementation for O(log N) search insert position.
     */
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println("Insert 5 in [1, 3, 5, 6]: " + searchInsert(nums, 5)); // 2
        System.out.println("Insert 2 in [1, 3, 5, 6]: " + searchInsert(nums, 2)); // 1
        System.out.println("Insert 7 in [1, 3, 5, 6]: " + searchInsert(nums, 7)); // 4
    }
}