package LinkedList;

public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle using slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode curr = slow;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare halves
        ListNode first = head;
        ListNode second = prev;
        while (second != null) {
            if (first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // 1 -> 2 -> 2 -> 1
        ListNode pal = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        // 1 -> 2 -> 3
        ListNode notPal = new ListNode(1, new ListNode(2, new ListNode(3)));

        System.out.println("Is 1->2->2->1 palindrome? " + isPalindrome(pal));   // true
        System.out.println("Is 1->2->3 palindrome? " + isPalindrome(notPal)); // false
    }
}