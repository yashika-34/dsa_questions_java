package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        ans.clear();
        solve(nums, 0, new ArrayList<>());
        return ans;
    }

    private void solve(int[] nums, int index, List<Integer> curr) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        solve(nums, index + 1, curr);
        curr.remove(curr.size() - 1);
        solve(nums, index + 1, curr);
    }

    public static void main(String[] args) {
        Subsets obj = new Subsets();
        int[] nums = {1, 2, 3};
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Power Set / Subsets: " + obj.subsets(nums));
    }
}
