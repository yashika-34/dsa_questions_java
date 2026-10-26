package Stack;

import java.util.Stack;

public class MinStack {

    public static int min(Stack<Integer> s) {
        int minimum = Integer.MAX_VALUE;

        while (!s.isEmpty()) {
            int x = s.pop();
            if (x < minimum) {
                minimum = x;
            }
        }

        return minimum;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(18);
        s.push(19);
        s.push(29);
        s.push(15);
        s.push(16);

        System.out.println("Minimum element in stack: " + min(s));
    }
}
