package Queue;
import java.util.*;

public class FirstNegativeWindow {

    static List<Integer> firstNegative(int[] arr, int k) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                q.offer(i);
            }

            int start = i - k + 1;

            // Remove negative indices outside the window
            while (!q.isEmpty() && q.peek() < start) {
                q.poll();
            }

            // Process only complete windows
            if (i >= k - 1) {
                if (q.isEmpty()) {
                    result.add(0);
                } else {
                    result.add(arr[q.peek()]);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(firstNegative(arr, k));
        sc.close();
    }
}