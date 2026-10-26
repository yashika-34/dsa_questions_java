package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {

    public static int[] getNextGreaterElements(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        int[] result = getNextGreaterElements(arr);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Next Greater Elements: " + Arrays.toString(result));
    }
}