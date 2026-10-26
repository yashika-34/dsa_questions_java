package Arrays;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int reverse = 0;
        int original = x;
        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }

        return reverse == original;
    }

    public static void main(String[] args) {
        int n1 = 121, n2 = -121, n3 = 10;
        System.out.println("Is " + n1 + " palindrome? " + isPalindrome(n1)); // true
        System.out.println("Is " + n2 + " palindrome? " + isPalindrome(n2)); // false
        System.out.println("Is " + n3 + " palindrome? " + isPalindrome(n3)); // false
    }
}