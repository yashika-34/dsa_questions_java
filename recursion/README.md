# 🔄 Recursion & Backtracking DSA in Java

This folder contains my implementations and problem solutions on **Recursion, Combinatorics, and Backtracking** using Java.

---

## 📌 Core Concepts & Templates

### 1. The Decision Tree (Include / Exclude)
Used for power sets and subset generation:
- At each index, branch into two decisions: **include** the current element or **exclude** it.
- Advance the recursion index until reaching base condition (`index == arr.length`).

### 2. Backtracking Template
Used for constraint-satisfaction problems (e.g., N-Queens, Sudoku Solver):
```java
void backtrack(State state) {
    if (isGoal(state)) {
        recordSolution(state);
        return;
    }
    for (Choice choice : getValidChoices(state)) {
        makeChoice(state, choice);
        backtrack(state);      // explore
        undoChoice(state, choice);  // backtrack
    }
}
```

---

## 📂 Problem Index

| File | Problem Description | LeetCode | Time Complexity | Space Complexity |
|---|---|:---:|:---:|:---:|
| [`Subsets.java`](Subsets.java) | Power set generation (Include/Exclude recursion) | LeetCode 78 | $O(2^N)$ | $O(N)$ recursion stack |
| [`SubsetsWithDup.java`](SubsetsWithDup.java) | Subsets II (Sorting + skipping duplicate elements) | LeetCode 90 | $O(2^N)$ | $O(N)$ recursion stack |
| [`Permutations.java`](Permutations.java) | Array permutations via recursive swapping/backtracking | LeetCode 46 | $O(N \cdot N!)$ | $O(N)$ |
| [`NQueens.java`](NQueens.java) | Placing $N$ non-attacking queens on an $N \times N$ board | LeetCode 51 | $O(N!)$ | $O(N^2)$ board |
| [`SudokuSolver.java`](SudokuSolver.java) | Solving a 9x9 Sudoku grid using constraint backtracking | LeetCode 37 | $O(9^{81})$ worst | $O(1)$ board |

---

## ⏱️ Key Complexity Insights

| Pattern | Typical Time Complexity | Auxiliary Space |
|---|:---:|:---:|
| **Subsets / Combinations** | $O(2^N)$ | $O(N)$ recursion depth |
| **Permutations** | $O(N!)$ | $O(N)$ recursion depth |
| **Grid Backtracking** | Exponential $O(B^D)$ | $O(D)$ recursion depth |

---

**Author:** Yashika Garg
