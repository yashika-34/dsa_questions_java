package Strings;

public class StringToAtoi {

    public static int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        int i = 0;
        int n = s.length();

        // 1. Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i == n) return 0;

        // 2. Check sign
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Convert digits and check overflow
        long total = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            total = total * 10 + digit;

            if (sign == 1 && total > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && (-total) < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int) (total * sign);
    }

    public static void main(String[] args) {
        String[] testCases = {"42", "   -042", "1337c0d3", "0-1", "words and 987", "-91283472332"};

        for (String test : testCases) {
            System.out.printf("myAtoi(\"%s\") = %d%n", test, myAtoi(test));
        }
    }
}