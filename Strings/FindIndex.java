package Strings;

public class FindIndex {

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println("Haystack: \"" + haystack + "\"");
        System.out.println("Needle: \"" + needle + "\"");
        System.out.println("First Index: " + strStr(haystack, needle));
    }
}