package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {

    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if (q == null) {
            return null;
        }

        int n = q.size();

        if (k <= 0 || k > n) {
            return q;
        }

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }

        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        for (int i = 0; i < n - k; i++) {
            q.add(q.remove());
        }

        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        int k = 3;

        System.out.println("Original Queue: " + q);

        reverseFirstK(q, k);

        System.out.println("Updated Queue: " + q);
    }
}