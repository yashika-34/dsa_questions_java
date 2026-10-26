package Arrays;

public class ReverseArray {

    public static void reverse(int[] arr) {
        if (arr == null) return;
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static String reverseWords(String s) {
        if (s == null) return null;
        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);
            if (i != 0) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original: " + java.util.Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed: " + java.util.Arrays.toString(arr));

        String str = "the sky is blue";
        System.out.println("Reversed words: \"" + reverseWords(str) + "\"");
    }
}
