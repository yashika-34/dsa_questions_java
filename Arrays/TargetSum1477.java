package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TargetSum1477 {

    public static int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;

        int[] best = new int[n];
        Arrays.fill(best, Integer.MAX_VALUE);

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int prefix = 0;
        int minLen = Integer.MAX_VALUE;
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            prefix += arr[i];

            if (map.containsKey(prefix - target)) {
                int start = map.get(prefix - target);
                int len = i - start;

                if (start >= 0 && best[start] != Integer.MAX_VALUE) {
                    answer = Math.min(answer, len + best[start]);
                }

                minLen = Math.min(minLen, len);
            }

            best[i] = minLen;
            map.put(prefix, i);
        }

        return answer == Integer.MAX_VALUE ? -1 : answer;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 4, 3};
        int target = 3;
        System.out.println("Min sum of lengths for target " + target + ": " + minSumOfLengths(arr, target)); // Output: 2
    }
}