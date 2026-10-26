package LinkedList;

public class DetectLoop {

    /**
     * Detects if a cycle/loop exists in a Linked List using Floyd's Tortoise and Hare algorithm.
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // 1 step
            fast = fast.next.next;    // 2 steps

            if (slow == fast) {
                return true;          // Cycle detected
            }
        }

        return false;                 // Reached end of list -> No cycle
    }

    public static void main(String[] args) {
        // Create list: 3 -> 2 -> 0 -> -4
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        // Create a cycle: -4 points back to second node (2)
        fourth.next = second;

        System.out.println("Has Cycle (with loop): " + hasCycle(head));

        // Break cycle and test again
        fourth.next = null;
        System.out.println("Has Cycle (after removing loop): " + hasCycle(head));
    }
}
