package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDup {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans.clear();
        Arrays.sort(nums);
        solve(nums, 0, new ArrayList<>());
        return ans;
    }

    private void solve(int[] nums, int index, List<Integer> curr) {
        ans.add(new ArrayList<>(curr));

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue; // Skip duplicate elements
            }
            curr.add(nums[i]);
            solve(nums, i + 1, curr);
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {
        SubsetsWithDup obj = new SubsetsWithDup();
        int[] nums = {1, 2, 2};
        System.out.println("Input with Duplicates: " + Arrays.toString(nums));
        System.out.println("Unique Subsets: " + obj.subsetsWithDup(nums));
    }
}
