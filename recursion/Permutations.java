package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        ans.clear();
        solve(nums, new ArrayList<>());
        return ans;
    }

    private void solve(int[] nums, List<Integer> curr) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (curr.contains(nums[i])) {
                continue;
            }
            curr.add(nums[i]);
            solve(nums, curr);
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {
        Permutations obj = new Permutations();
        int[] nums = {1, 2, 3};
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("All Permutations: " + obj.permute(nums));
    }
}