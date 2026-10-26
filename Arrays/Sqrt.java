package Arrays;

public class Sqrt {

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        long low = 1;
        long high = x;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid * mid == x) {
                return (int) mid;
            }

            if (mid * mid < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) high;
    }

    public static void main(String[] args) {
        System.out.println("sqrt(4): " + mySqrt(4));   // 2
        System.out.println("sqrt(8): " + mySqrt(8));   // 2
        System.out.println("sqrt(16): " + mySqrt(16)); // 4
    }
}