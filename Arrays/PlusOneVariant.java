package Arrays;

import java.util.Arrays;

public class PlusOneVariant {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // carry over
        }

        // If all digits were 9 (e.g. 999 -> 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] d1 = {1, 2, 3};
        int[] d2 = {9, 9, 9};

        System.out.println("Plus one on [1, 2, 3]: " + Arrays.toString(plusOne(d1))); // [1, 2, 4]
        System.out.println("Plus one on [9, 9, 9]: " + Arrays.toString(plusOne(d2))); // [1, 0, 0, 0]
    }
}