package Strings;

import java.util.Arrays;

public class ValidAnagrams {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Frequency array approach (O(1) space)
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram", t1 = "nagaram";
        String s2 = "rat", t2 = "car";

        System.out.printf("isAnagram(\"%s\", \"%s\") = %b%n", s1, t1, isAnagram(s1, t1));
        System.out.printf("isAnagram(\"%s\", \"%s\") = %b%n", s2, t2, isAnagram(s2, t2));
    }
}