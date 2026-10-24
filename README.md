# 🚀 Data Structures & Algorithms in Java

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Problems%20Solved-65%2B-brightgreen?style=for-the-badge" alt="Problems Solved" />
  <img src="https://img.shields.io/badge/Topics-7-blue?style=for-the-badge" alt="Topics" />
  <img src="https://img.shields.io/badge/Architecture-Modular%20Guides-purple?style=for-the-badge" alt="Modular Architecture" />
  <img src="https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge" alt="License" />
  <img src="https://img.shields.io/badge/Status-Actively%20Practicing-orange?style=for-the-badge" alt="Status" />
</p>

A structured, well-organized repository of **Data Structures and Algorithms (DSA) solutions implemented from scratch in Java**. Built to develop strong problem-solving fundamentals, master core computer science concepts, and prepare for technical interviews and placement assessments.

---

## 📊 Topics & Progress

Every topic folder contains its own dedicated technical study guide and problem breakdown:

| Topic | Directory | Problems Solved | Documentation | Key Highlights |
|:---|:---:|:---:|:---:|:---|
| 📦 **Arrays** | [`Arrays/`](./Arrays) | 30 | [📖 View Documentation](./Arrays/README.md) | Two Pointers, Sliding Window, Prefix Sums, Kadane's |
| 🔗 **Linked Lists** | [`LinkedList/`](./LinkedList) | 10 | [📖 View Documentation](./LinkedList/README.md) | Floyd's Cycle, k-Group Reversal, Merging & Two Pointers |
| 📚 **Stack** | [`Stack/`](./Stack) | 9 | [📖 View Documentation](./Stack/README.md) | Monotonic Stack, Infix/Postfix, Bracket Matching |
| 🔤 **Strings** | [`Strings/`](./Strings) | 3 | [📖 View Documentation](./Strings/README.md) | Anagrams, String Parsing, Pattern Matching |
| 🌳 **Trees** | [`Trees/`](./Trees) | 4 | [📖 View Documentation](./Trees/README.md) | Binary Tree Traversals, LCA, Maximum Depth |
| ⛰️ **Heaps** | [`heaps/`](./heaps) | 8 | [📖 View Documentation](./heaps/README.md) | Min/Max Heap, Heap Sort, Heapify, K Largest Elements |
| 🔄 **Recursion** | [`recursion/`](./recursion) | 5 | [📖 View Documentation](./recursion/README.md) | Backtracking, N-Queens, Sudoku Solver, Subsets |
| **Total** | | **69** | **7 Comprehensive Guides** | |

---

## 📖 Topic Documentation & Revision Guides

Each topic folder includes a standalone technical guide containing theory, core operations, complexity tables, and implementation details:

- [**📦 Arrays Documentation**](./Arrays/README.md): Two pointers, sliding window technique, Kadane's algorithm, prefix sums, and Boyer-Moore voting.
- [**🔗 Linked Lists Documentation**](./LinkedList/README.md): Singly linked list architecture, Floyd's cycle detection, in-place 3-pointer reversal, and k-group reversal.
- [**📚 Stack Documentation**](./Stack/README.md): Array & Linked List stack implementations, monotonic stacks for Next Greater Element, and arithmetic expression evaluation.
- [**🔤 Strings Documentation**](./Strings/README.md): Character frequency arrays, `atoi` parsing with overflow detection, and pattern matching.
- [**🌳 Binary Trees Documentation**](./Trees/README.md): `TreeNode` structure, recursive DFS traversals (Inorder, Preorder, Postorder), maximum depth, and Lowest Common Ancestor.
- [**⛰️ Heaps Documentation**](./heaps/README.md): Complete binary tree array indexing, Min/Max Heap from scratch, downward heapify, $O(N)$ build heap, and Heap Sort.
- [**🔄 Recursion Documentation**](./recursion/README.md): State-space decision trees (include/exclude), and standard backtracking templates (N-Queens, Sudoku).

---

## 📂 Repository Structure

```text
dsa_questions_java/
├── Arrays/          # 30 problems + README.md (Two Pointers, Prefix Sums, Kadane's)
├── LinkedList/      # 10 problems + README.md (Cycle Detection, Reversals)
├── Stack/           # 9 problems  + README.md (Monotonic Stack, Infix/Postfix)
├── Strings/         # 3 problems  + README.md (Anagrams, String Parsing)
├── Trees/           # 4 problems  + README.md (DFS Traversals, LCA, Max Depth)
├── heaps/           # 8 problems  + README.md (Min/Max Heap, Heap Sort)
├── recursion/       # 5 problems  + README.md (N-Queens, Sudoku, Subsets)
└── README.md        # Main showcase & centralized problem index
```

---

## 📑 Problem Index

<details open>
<summary><b>📦 Arrays (30 Solutions) — <a href="Arrays/README.md">View Topic Guide</a></b></summary>
<br>

| Problem / File | Concept / LeetCode Equivalent |
|---|---|
| [`TwoSum.java`](Arrays/TwoSum.java) | LeetCode 1: Two Sum (Hash Map / Two Pointers) |
| [`MaximumSubarray.java`](Arrays/MaximumSubarray.java) | LeetCode 53: Maximum Subarray (Kadane's Algorithm) |
| [`MaximumSubarraySum.java`](Arrays/MaximumSubarraySum.java) | Kadane's Algorithm for Maximum Subarray Sum |
| [`MaxProduct.java`](Arrays/MaxProduct.java) | LeetCode 152: Maximum Product Subarray |
| [`BestTimeToBuyAndSell.java`](Arrays/BestTimeToBuyAndSell.java) | LeetCode 121: Best Time to Buy and Sell Stock |
| [`MajorityElement.java`](Arrays/MajorityElement.java) | LeetCode 169: Majority Element (Boyer-Moore Voting) |
| [`LongestConsecutiveSequence.java`](Arrays/LongestConsecutiveSequence.java) | LeetCode 128: Longest Consecutive Sequence |
| [`SubarraySumEqualsK.java`](Arrays/SubarraySumEqualsK.java) | LeetCode 560: Subarray Sum Equals K (Prefix Sum) |
| [`TargetSum1477.java`](Arrays/TargetSum1477.java) | LeetCode 1477: Non-overlapping Subarrays with Target Sum |
| [`RunningSum.java`](Arrays/RunningSum.java) | LeetCode 1480: Running Sum of 1D Array |
| [`RangeSumQuery.java`](Arrays/RangeSumQuery.java) | LeetCode 303: Range Sum Query - Immutable |
| [`SearchInsertPosition.java`](Arrays/SearchInsertPosition.java) | LeetCode 35: Search Insert Position (Binary Search) |
| [`Sqrt.java`](Arrays/Sqrt.java) | LeetCode 69: Sqrt(x) via Binary Search |
| [`RotateImage.java`](Arrays/RotateImage.java) | LeetCode 48: Rotate Image / 90° Matrix Rotation |
| [`MoveZeroes.java`](Arrays/MoveZeroes.java) | LeetCode 283: Move Zeroes (In-place) |
| [`RemoveDuplicates.java`](Arrays/RemoveDuplicates.java) | LeetCode 26: Remove Duplicates from Sorted Array |
| [`MissingNumber.java`](Arrays/MissingNumber.java) | LeetCode 268: Missing Number (XOR / Sum Formula) |
| [`SingleNumber.java`](Arrays/SingleNumber.java) | LeetCode 136: Single Number (Bit Manipulation) |
| [`MaxConsecutiveOnes.java`](Arrays/MaxConsecutiveOnes.java) | LeetCode 485: Max Consecutive Ones |
| [`PalindromeNumber.java`](Arrays/PalindromeNumber.java) | LeetCode 9: Palindrome Number |
| [`PlusOne.java`](Arrays/PlusOne.java) | LeetCode 66: Plus One |
| [`PlusOneVariant.java`](Arrays/PlusOneVariant.java) | Array Plus One Variant |
| [`Largest.java`](Arrays/Largest.java) | Find Largest Element in Array |
| [`SecondLargest.java`](Arrays/SecondLargest.java) | Find Second Largest Element in Array |
| [`ReverseArray.java`](Arrays/ReverseArray.java) | Reverse an Array (Two Pointer Technique) |
| [`CheckSubarray.java`](Arrays/CheckSubarray.java) | Check Subarray Existence |
| [`CheckArraySortedAndRotated.java`](Arrays/CheckArraySortedAndRotated.java) | LeetCode 1752: Check if Array is Sorted and Rotated |
| [`SubsetsKOverlapping.java`](Arrays/SubsetsKOverlapping.java) | LeetCode 1621: Number of Sets of K Non-Overlapping Line Segments |
| [`Question3903.java`](Arrays/Question3903.java) | Array Problem Practice |
| [`NextGreaterElement.java`](Arrays/NextGreaterElement.java) | LeetCode 496: Next Greater Element I (Monotonic Stack) |

</details>

<details open>
<summary><b>🔗 Linked Lists (10 Solutions) — <a href="LinkedList/README.md">View Topic Guide</a></b></summary>
<br>

| Problem / File | Concept / LeetCode Equivalent |
|---|---|
| [`ReverseLinkedList.java`](LinkedList/ReverseLinkedList.java) | LeetCode 206: Reverse Linked List (Iterative) |
| [`ReverseByK.java`](LinkedList/ReverseByK.java) | LeetCode 25: Reverse Nodes in k-Group |
| [`DetectLoop.java`](LinkedList/DetectLoop.java) | LeetCode 141: Linked List Cycle (Floyd's Tortoise & Hare) |
| [`PalindromeLinkedList.java`](LinkedList/PalindromeLinkedList.java) | LeetCode 234: Palindrome Linked List |
| [`MergeLinkedList.java`](LinkedList/MergeLinkedList.java) | LeetCode 21: Merge Two Sorted Lists |
| [`AddTwoNumbers.java`](LinkedList/AddTwoNumbers.java) | LeetCode 2: Add Two Numbers |
| [`RemoveNthFromEnd.java`](LinkedList/RemoveNthFromEnd.java) | LeetCode 19: Remove Nth Node From End of List |
| [`RemoveElements.java`](LinkedList/RemoveElements.java) | LeetCode 203: Remove Linked List Elements |
| [`OddEvenLinkedList.java`](LinkedList/OddEvenLinkedList.java) | LeetCode 328: Odd Even Linked List |
| [`SortColors.java`](LinkedList/SortColors.java) | LeetCode 75: Sort Colors / Three-Way Partitioning |

</details>

<details open>
<summary><b>📚 Stack (9 Solutions) — <a href="Stack/README.md">View Topic Guide</a></b></summary>
<br>

| Problem / File | Concept / Description |
|---|---|
| [`StackArray.java`](Stack/StackArray.java) | Stack implementation from scratch using dynamic arrays |
| [`StackLinkedList.java`](Stack/StackLinkedList.java) | Stack implementation from scratch using Linked List nodes |
| [`ValidParentheses.java`](Stack/ValidParentheses.java) | LeetCode 20: Valid Parentheses / Bracket Matching |
| [`NextGreater.java`](Stack/NextGreater.java) | Next Greater Element using Monotonic Stack |
| [`MinStack.java`](Stack/MinStack.java) | Min Stack: Retrieve minimum element in $O(1)$ time |
| [`InfixtoPostfix.java`](Stack/InfixtoPostfix.java) | Operator precedence and Infix to Postfix conversion |
| [`EvaluatePostfix.java`](Stack/EvaluatePostfix.java) | Postfix arithmetic expression evaluation |
| [`EvaluatePrefix.java`](Stack/EvaluatePrefix.java) | Prefix expression evaluation |
| [`MinReversal.java`](Stack/MinReversal.java) | Minimum bracket reversals to balance an expression |

</details>

<details open>
<summary><b>⛰️ Heaps & Priority Queues (8 Solutions) — <a href="heaps/README.md">View Topic Guide</a></b></summary>
<br>

| Problem / File | Description | Time Complexity |
|---|---|---|
| [`MinHeap.java`](heaps/MinHeap.java) | Complete Min Heap implementation (`insert`, `deleteRoot`, `peek`) | Insert: $O(\log N)$, Delete: $O(\log N)$, Peek: $O(1)$ |
| [`HeapInsert.java`](heaps/HeapInsert.java) | Max Heap insertion with upward heapify | $O(\log N)$ |
| [`HeapDelete.java`](heaps/HeapDelete.java) | Max Heap root deletion and downward heapify | $O(\log N)$ |
| [`HeapPeek.java`](heaps/HeapPeek.java) | Peek maximum element at root | $O(1)$ |
| [`Heapify.java`](heaps/Heapify.java) | Downward heapify to maintain the heap property | $O(\log N)$ |
| [`BuildHeap.java`](heaps/BuildHeap.java) | Constructing a Max Heap from an unsorted array | $O(N)$ |
| [`HeapSort.java`](heaps/HeapSort.java) | In-place sorting of an array in ascending order | $O(N \log N)$ |
| [`KLargestElements.java`](heaps/KLargestElements.java) | Finding the top $K$ largest elements using a Min Heap | $O(N \log K)$ |

</details>

<details open>
<summary><b>🔄 Recursion & Backtracking (5 Solutions) — <a href="recursion/README.md">View Topic Guide</a></b></summary>
<br>

| Problem / File | Concept / LeetCode Equivalent |
|---|---|
| [`NQueens.java`](recursion/NQueens.java) | LeetCode 51: N-Queens Problem (Backtracking & Board Validation) |
| [`SudokuSolver.java`](recursion/SudokuSolver.java) | LeetCode 37: Sudoku Solver (Backtracking) |
| [`Subsets.java`](recursion/Subsets.java) | LeetCode 78: Subsets / Power Set Generation |
| [`SubsetsWithDup.java`](recursion/SubsetsWithDup.java) | LeetCode 90: Subsets II (Handling Duplicate Elements) |
| [`Permutations.java`](recursion/Permutations.java) | LeetCode 46: Permutations of an Array |

</details>

<details open>
<summary><b>🌳 Binary Trees (4 Solutions) — <a href="Trees/README.md">View Topic Guide</a></b></summary>
<br>

| Problem / File | Concept / LeetCode Equivalent |
|---|---|
| [`TreeNode.java`](Trees/TreeNode.java) | Binary Tree Node class definition |
| [`Main.java`](Trees/Main.java) | Tree construction & Traversal Drivers (Inorder, Preorder, Postorder) |
| [`MaximumDepthOfTree.java`](Trees/MaximumDepthOfTree.java) | LeetCode 104: Maximum Depth of Binary Tree |
| [`LowestCommonAncestor.java`](Trees/LowestCommonAncestor.java) | LeetCode 236: Lowest Common Ancestor (LCA) |

</details>

<details open>
<summary><b>🔤 Strings (3 Solutions) — <a href="Strings/README.md">View Topic Guide</a></b></summary>
<br>

| Problem / File | Concept / LeetCode Equivalent |
|---|---|
| [`ValidAnagrams.java`](Strings/ValidAnagrams.java) | LeetCode 242: Valid Anagram (Frequency Array) |
| [`StringToAtoi.java`](Strings/StringToAtoi.java) | LeetCode 8: String to Integer (atoi) |
| [`FindIndex.java`](Strings/FindIndex.java) | LeetCode 28: Find the Index of the First Occurrence in a String |

</details>

---

## 🛠️ Tech Stack & Tools

- **Programming Language:** Java (JDK 8+)
- **IDE:** Visual Studio Code
- **Build & Run:** OpenJDK CLI tools (`javac`, `java`)
- **Version Control:** Git & GitHub

---

## ▶️ How to Run the Solutions

### 1. Clone the repository
```bash
git clone https://github.com/yashika-34/dsa_questions_java.git
cd dsa_questions_java
```

### 2. Standalone Programs (e.g., Arrays, LinkedList, Stack, Strings, Recursion)
```bash
# Compile
javac Arrays/TwoSum.java

# Run
java Arrays.TwoSum
```

### 3. Packaged Programs (e.g., Heaps)
Files inside the `heaps/` directory belong to `package heaps;`. Always compile and execute them from the repository root:
```bash
# Compile
javac heaps/MinHeap.java

# Run
java heaps.MinHeap
```

---

## 🎯 Learning Roadmap & Key Takeaways

- [x] Master Arrays & Two-Pointer techniques
- [x] Singly Linked List operations, reversals, and cycle detection
- [x] Stack applications (LIFO, conversions, monotonic patterns)
- [x] Binary Trees and common traversals (DFS, LCA)
- [x] Binary Heaps from scratch, Heapify, and Heap Sort
- [x] Classic Backtracking (N-Queens, Sudoku, Subsets)
- [ ] Binary Search Trees (BST) & Advanced Tree Operations
- [ ] Graph Algorithms (BFS, DFS, Dijkstra, Topological Sort)
- [ ] Dynamic Programming (1D, 2D, Knapsack, LCS)

---

## 👩‍💻 Author

**Yashika Garg**  
- GitHub: [@yashika-34](https://github.com/yashika-34)

*Consistency beats intensity. One problem at a time.* 🚀