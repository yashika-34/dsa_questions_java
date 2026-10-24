# 🔗 Linked List DSA in Java

This folder contains my solutions and practice problems on **Singly Linked Lists** using Java.

---

## 📌 Core Concepts

A **Linked List** is a linear data structure where elements are not stored at contiguous memory locations. Instead, each element (node) contains a data value and a pointer (reference) to the next node.

### Standard Node Structure
```java
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
```

---

## 📚 Key Patterns & Techniques

1. **Two Pointers (Fast & Slow / Floyd's Cycle Detection):**
   - Detecting cycles in $O(N)$ time and $O(1)$ space.
   - Finding the middle node of the list.
   - Finding the $N$-th node from the end in a single pass.
2. **In-place Reversal:**
   - Reversing a linked list iteratively using three pointers: `prev`, `curr`, and `next`.
   - Reversing nodes in batches of $K$ (`k-Group reversal`).
3. **Dummy Head Technique:**
   - Eliminating boundary edge-cases when adding, merging, or deleting the head node.
4. **Partitioning & Merging:**
   - Segregating odd and even nodes.
   - Merging two sorted linked lists in $O(N_1 + N_2)$ time.

---

## 📂 Files & Solutions

| File | Problem Description | LeetCode | Time Complexity | Space Complexity |
|---|---|:---:|:---:|:---:|
| [`ReverseLinkedList.java`](ReverseLinkedList.java) | Reverse Linked List (Iterative 3-pointer) | LeetCode 206 | $O(N)$ | $O(1)$ |
| [`ReverseByK.java`](ReverseByK.java) | Reverse Nodes in k-Group | LeetCode 25 | $O(N)$ | $O(1)$ |
| [`DetectLoop.java`](DetectLoop.java) | Cycle Detection (Floyd's Tortoise & Hare) | LeetCode 141 | $O(N)$ | $O(1)$ |
| [`PalindromeLinkedList.java`](PalindromeLinkedList.java) | Palindrome Linked List (Find Middle + Reverse) | LeetCode 234 | $O(N)$ | $O(1)$ |
| [`MergeLinkedList.java`](MergeLinkedList.java) | Merge Two Sorted Lists | LeetCode 21 | $O(N + M)$ | $O(1)$ |
| [`AddTwoNumbers.java`](AddTwoNumbers.java) | Add Two Numbers represented by Linked Lists | LeetCode 2 | $O(\max(N, M))$ | $O(\max(N, M))$ |
| [`RemoveNthFromEnd.java`](RemoveNthFromEnd.java) | Remove Nth Node From End (One-pass Two Pointers) | LeetCode 19 | $O(N)$ | $O(1)$ |
| [`RemoveElements.java`](RemoveElements.java) | Remove Linked List Elements matching value | LeetCode 203 | $O(N)$ | $O(1)$ |
| [`OddEvenLinkedList.java`](OddEvenLinkedList.java) | Odd Even Linked List (Grouping by node index) | LeetCode 328 | $O(N)$ | $O(1)$ |
| [`SortColors.java`](SortColors.java) | Sort Colors (Three-Way Partitioning) | LeetCode 75 | $O(N)$ | $O(1)$ |

---

## ⏱️ Complexity Summary

| Pattern | Time Complexity | Auxiliary Space |
|---|:---:|:---:|
| **Traversal / Search** | $O(N)$ | $O(1)$ |
| **Insert / Delete at Head** | $O(1)$ | $O(1)$ |
| **Insert / Delete at Position $K$** | $O(K)$ | $O(1)$ |
| **In-place Reversal** | $O(N)$ | $O(1)$ |
| **Cycle Detection** | $O(N)$ | $O(1)$ |

---

**Author:** Yashika Garg
