# 🚀 Data Structures & Algorithms in Java

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Problems%20Solved-65%2B-brightgreen?style=for-the-badge" alt="Problems Solved" />
  <img src="https://img.shields.io/badge/Topics-7-blue?style=for-the-badge" alt="Topics" />
  <img src="https://img.shields.io/badge/Status-Actively%20Practicing-orange?style=for-the-badge" alt="Status" />
</p>

A structured, well-organized repository of **Data Structures and Algorithms (DSA) solutions implemented from scratch in Java**. Built to develop strong problem-solving fundamentals, master core computer science concepts, and prepare for technical interviews and placement assessments.

---

## 📊 Topics & Progress

| Topic | Directory | Problems Solved | Documentation | Key Highlights |
|:---|:---:|:---:|:---:|:---|
| 📦 **Arrays** | [`Arrays/`](./Arrays) | 30 | Available | Two Pointers, Sliding Window, Prefix Sums, Kadane's |
| 🔗 **Linked Lists** | [`LinkedList/`](./LinkedList) | 10 | Available | Floyd's Cycle, k-Group Reversal, Merging & Two Pointers |
| 📚 **Stack** | [`Stack/`](./Stack) | 9 | [`Stack/Readme.MD`](./Stack/Readme.MD) | Monotonic Stack, Infix/Postfix, Bracket Matching |
| 🔤 **Strings** | [`Strings/`](./Strings) | 3 | Available | Anagrams, String Parsing, Pattern Matching |
| 🌳 **Trees** | [`Trees/`](./Trees) | 4 | Available | Binary Tree Traversals, LCA, Maximum Depth |
| ⛰️ **Heaps** | [`heaps/`](./heaps) | 8 | [`heaps/README.md`](./heaps/README.md) | Min/Max Heap, Heap Sort, Heapify, K Largest Elements |
| 🔄 **Recursion** | [`recursion/`](./recursion) | 5 | Available | Backtracking, N-Queens, Sudoku Solver, Subsets |
| **Total** | | **69** | | |

---

## 📂 Repository Structure

```text
dsa_questions_java/
├── Arrays/          # Array manipulations, searching & subarray problems
├── LinkedList/      # Singly linked lists, cycle detection & reversals
├── Stack/           # Array/LL stacks, expression evaluation & Monotonic Stack
├── Strings/         # String transformations, anagrams & parsing
├── Trees/           # Binary trees, traversals & ancestor queries
├── heaps/           # Complete Min/Max heap implementations & Heap Sort
├── recursion/       # Backtracking & combinatorial search problems
└── README.md
```

---

## 📑 Problem Index

<details open>
<summary><b>📦 Arrays (30 Solutions)</b></summary>
<br>

| Problem / File | Concept / LeetCode Equivalent |
|---|---|
| [`Two_sum.java`](Arrays/Two_sum.java) | LeetCode 1: Two Sum (Hash Map / Two Pointers) |
| [`53_max_subarray.java`](Arrays/53_max_subarray.java) | LeetCode 53: Maximum Subarray (Kadane's Algorithm) |
| [`Maximum_subarray_sum.java`](Arrays/Maximum_subarray_sum.java) | Kadane's Algorithm for Maximum Subarray Sum |
| [`Max_product.java`](Arrays/Max_product.java) | LeetCode 152: Maximum Product Subarray |
| [`best_time_to_buy_and_sell.java`](Arrays/best_time_to_buy_and_sell.java) | LeetCode 121: Best Time to Buy and Sell Stock |
| [`Majority_element.java`](Arrays/Majority_element.java) | LeetCode 169: Majority Element (Boyer-Moore Voting) |
| [`Longest_Consecutive_sequence.java`](Arrays/Longest_Consecutive_sequence.java) | LeetCode 128: Longest Consecutive Sequence |
| [`SubArray_sum_equals_k.java`](Arrays/SubArray_sum_equals_k.java) | LeetCode 560: Subarray Sum Equals K (Prefix Sum) |
| [`targetsum1477.java`](Arrays/targetsum1477.java) | LeetCode 1477: Non-overlapping Subarrays with Target Sum |
| [`1480_Running_sum.java`](Arrays/1480_Running_sum.java) | LeetCode 1480: Running Sum of 1D Array |
| [`303_RangeSumQuery.java`](Arrays/303_RangeSumQuery.java) | LeetCode 303: Range Sum Query - Immutable |
| [`35_search_Insert.java`](Arrays/35_search_Insert.java) | LeetCode 35: Search Insert Position (Binary Search) |
| [`sqrt.java`](Arrays/sqrt.java) | LeetCode 69: Sqrt(x) via Binary Search |
| [`48_rotate_image.java`](Arrays/48_rotate_image.java) | LeetCode 48: Rotate Image / 90° Matrix Rotation |
| [`Move_Zeros.java`](Arrays/Move_Zeros.java) | LeetCode 283: Move Zeroes (In-place) |
| [`Remove_duplicates.java`](Arrays/Remove_duplicates.java) | LeetCode 26: Remove Duplicates from Sorted Array |
| [`Missing_number.java`](Arrays/Missing_number.java) | LeetCode 268: Missing Number (XOR / Sum Formula) |
| [`Single_number.java`](Arrays/Single_number.java) | LeetCode 136: Single Number (Bit Manipulation) |
| [`Max_ConsecutiveOnes.java`](Arrays/Max_ConsecutiveOnes.java) | LeetCode 485: Max Consecutive Ones |
| [`palindromeNumber.java`](Arrays/palindromeNumber.java) | LeetCode 9: Palindrome Number |
| [`plus_one.java`](Arrays/plus_one.java) | LeetCode 66: Plus One |
| [`91_plus_one.java`](Arrays/91_plus_one.java) | Array Plus One Variant |
| [`Largest.java`](Arrays/Largest.java) | Find Largest Element in Array |
| [`Second_Largest.java`](Arrays/Second_Largest.java) | Find Second Largest Element in Array |
| [`reverse.java`](Arrays/reverse.java) | Reverse an Array (Two Pointer Technique) |
| [`check_subarray.java`](Arrays/check_subarray.java) | Check Subarray Existence |
| [`1752_CheckArrayisSortedorRotataed.java`](Arrays/1752_CheckArrayisSortedorRotataed.java) | LeetCode 1752: Check if Array is Sorted and Rotated |
| [`1621_noofrsubsetsKOverlapping.java`](Arrays/1621_noofrsubsetsKOverlapping.java) | LeetCode 1621: Number of Sets of K Non-Overlapping Line Segments |
| [`3903question.java`](Arrays/3903question.java) | Array Problem Practice |
| [`496_Next_Greater.cpp`](Arrays/496_Next_Greater.cpp) | Next Greater Element I (C++ Solution) |

</details>

<details open>
<summary><b>🔗 Linked Lists (10 Solutions)</b></summary>
<br>

| Problem / File | Concept / LeetCode Equivalent |
|---|---|
| [`ReverseLinkedList206.java`](LinkedList/ReverseLinkedList206.java) | LeetCode 206: Reverse Linked List (Iterative) |
| [`ReverseByK25.java`](LinkedList/ReverseByK25.java) | LeetCode 25: Reverse Nodes in k-Group |
| [`detectAloop.java`](LinkedList/detectAloop.java) | LeetCode 141: Linked List Cycle (Floyd's Tortoise & Hare) |
| [`palindromell.java`](LinkedList/palindromell.java) | LeetCode 234: Palindrome Linked List |
| [`mergell.java`](LinkedList/mergell.java) | LeetCode 21: Merge Two Sorted Lists |
| [`addTwo.java`](LinkedList/addTwo.java) | LeetCode 2: Add Two Numbers |
| [`RemoveNthfromEnd.java`](LinkedList/RemoveNthfromEnd.java) | LeetCode 19: Remove Nth Node From End of List |
| [`removeLLelements.java`](LinkedList/removeLLelements.java) | LeetCode 203: Remove Linked List Elements |
| [`odd_Evenll.java`](LinkedList/odd_Evenll.java) | LeetCode 328: Odd Even Linked List |
| [`SortColors.java`](LinkedList/SortColors.java) | LeetCode 75: Sort Colors / Three-Way Partitioning |

</details>

<details open>
<summary><b>📚 Stack (9 Solutions) — <a href="Stack/Readme.MD">View Module Documentation</a></b></summary>
<br>

| Problem / File | Concept / Description |
|---|---|
| [`StackArray.java`](Stack/StackArray.java) | Stack implementation from scratch using dynamic arrays |
| [`Stackll.java`](Stack/Stackll.java) | Stack implementation from scratch using Linked List nodes |
| [`validParethesis.java`](Stack/validParethesis.java) | LeetCode 20: Valid Parentheses / Bracket Matching |
| [`nextGreater.java`](Stack/nextGreater.java) | Next Greater Element using Monotonic Stack |
| [`minimum.java`](Stack/minimum.java) | Min Stack: Retrieve minimum element in $O(1)$ time |
| [`InfixtoPostfix.java`](Stack/InfixtoPostfix.java) | Operator precedence and Infix to Postfix conversion |
| [`EvaluatePostfix.java`](Stack/EvaluatePostfix.java) | Postfix arithmetic expression evaluation |
| [`EvaluatePrefix.java`](Stack/EvaluatePrefix.java) | Prefix expression evaluation |
| [`MinReversal.java`](Stack/MinReversal.java) | Minimum bracket reversals to balance an expression |

</details>

<details open>
<summary><b>⛰️ Heaps & Priority Queues (8 Solutions) — <a href="heaps/README.md">View Module Documentation</a></b></summary>
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
<summary><b>🔄 Recursion & Backtracking (5 Solutions)</b></summary>
<br>

| Problem / File | Concept / LeetCode Equivalent |
|---|---|
| [`Nqueens.java`](recursion/Nqueens.java) | LeetCode 51: N-Queens Problem (Backtracking & Board Validation) |
| [`sudoku.java`](recursion/sudoku.java) | LeetCode 37: Sudoku Solver (Backtracking) |
| [`subsets78.java`](recursion/subsets78.java) | LeetCode 78: Subsets / Power Set Generation |
| [`subests90.java`](recursion/subests90.java) | LeetCode 90: Subsets II (Handling Duplicate Elements) |
| [`permutation78.java`](recursion/permutation78.java) | LeetCode 46: Permutations of an Array |

</details>

<details open>
<summary><b>🌳 Binary Trees (4 Solutions)</b></summary>
<br>

| Problem / File | Concept / LeetCode Equivalent |
|---|---|
| [`TreeNode.java`](Trees/TreeNode.java) | Binary Tree Node class definition |
| [`Main.java`](Trees/Main.java) | Tree construction & Traversal Drivers (Inorder, Preorder, Postorder) |
| [`104_Maximum_depth_ofTree.java`](Trees/104_Maximum_depth_ofTree.java) | LeetCode 104: Maximum Depth of Binary Tree |
| [`236_minAncestor.java`](Trees/236_minAncestor.java) | LeetCode 236: Lowest Common Ancestor (LCA) |

</details>

<details open>
<summary><b>🔤 Strings (3 Solutions)</b></summary>
<br>

| Problem / File | Concept / LeetCode Equivalent |
|---|---|
| [`ValidAnagrams.java`](Strings/ValidAnagrams.java) | LeetCode 242: Valid Anagram (Frequency Array) |
| [`String_toatoi.java`](Strings/String_toatoi.java) | LeetCode 8: String to Integer (atoi) |
| [`28_find_the%20index.java`](Strings/28_find_the%20index.java) | LeetCode 28: Find the Index of the First Occurrence in a String |

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
javac Arrays/Two_sum.java

# Run
java Arrays.Two_sum
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