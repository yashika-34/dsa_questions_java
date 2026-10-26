package Stack;

import java.util.Stack;

public class MinReversal {

    public static int minReversal(String expr) {
        if (expr.length() % 2 != 0) {
            return -1; // Odd length expressions cannot be balanced
        }

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (ch == '[') {
                st.push(ch);
            } else {
                if (!st.isEmpty() && st.peek() == '[') {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
        }

        int open = 0;
        int close = 0;
        while (!st.isEmpty()) {
            if (st.pop() == '[') {
                open++;
            } else {
                close++;
            }
        }

        return (open + 1) / 2 + (close + 1) / 2;
    }

    public static void main(String[] args) {
        String s1 = "][][";
        String s2 = "]]][[[";

        System.out.println("Min reversals for \"" + s1 + "\": " + minReversal(s1));
        System.out.println("Min reversals for \"" + s2 + "\": " + minReversal(s2));
    }
}