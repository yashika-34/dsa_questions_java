package LinkedList;

public class ReverseByK {

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        while (count < k && temp != null) {
            temp = temp.next;
            count++;
        }
        if (count < k) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        count = 0;
        while (curr != null && count < k) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        head.next = reverseKGroup(curr, k);
        return prev;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 1 -> 2 -> 3 -> 4 -> 5, k = 2
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        System.out.print("Original List: ");
        printList(head);

        ListNode result = reverseKGroup(head, 2);
        System.out.print("Reversed in 2-Groups: ");
        printList(result); // 2 -> 1 -> 4 -> 3 -> 5
    }
}
