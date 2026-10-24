# 📦 Arrays DSA in Java

This folder contains my solutions and practice problems on **Arrays and Matrix Manipulations** using Java (and C++).

---

## 📌 Core Algorithmic Patterns

1. **Two Pointers & Sliding Window:**
   - Traversal from both ends towards the center (e.g., `TwoSum.java`, `ReverseArray.java`).
   - Maintaining dynamic windows for subarray constraints (e.g., `SubarraySumEqualsK.java`).
2. **Kadane's Algorithm:**
   - Optimal $O(N)$ dynamic approach to find maximum sum of contiguous subarrays (`MaximumSubarray.java`, `MaximumSubarraySum.java`).
3. **Prefix Sums & Range Queries:**
   - Precomputing running totals for $O(1)$ query time (`RunningSum.java`, `RangeSumQuery.java`, `SubarraySumEqualsK.java`).
4. **Boyer-Moore Voting Algorithm:**
   - Finding majority elements in linear time $O(N)$ and $O(1)$ space (`MajorityElement.java`).
5. **Binary Search on Arrays:**
   - Finding search insertion points and integer square roots in $O(\log N)$ time (`SearchInsertPosition.java`, `Sqrt.java`).
6. **In-place Matrix Manipulations:**
   - 2D grid rotations and transformations (`RotateImage.java`).

---

## 📂 Problem Index (30 Solutions)

| Problem / File | Concept | LeetCode / Source | Time Complexity | Space Complexity |
|---|---|:---:|:---:|:---:|
| [`TwoSum.java`](TwoSum.java) | Hash Map complement search | LeetCode 1 | $O(N)$ | $O(N)$ |
| [`MaximumSubarray.java`](MaximumSubarray.java) | Kadane's Algorithm (Max Subarray) | LeetCode 53 | $O(N)$ | $O(1)$ |
| [`MaximumSubarraySum.java`](MaximumSubarraySum.java) | Subarray sum evaluation | Core DSA | $O(N^2)$ brute | $O(1)$ |
| [`MaxProduct.java`](MaxProduct.java) | Maximum product subarray | LeetCode 152 | $O(N)$ | $O(N)$ |
| [`BestTimeToBuyAndSell.java`](BestTimeToBuyAndSell.java) | Single-pass min-price tracking | LeetCode 121 | $O(N)$ | $O(1)$ |
| [`MajorityElement.java`](MajorityElement.java) | Boyer-Moore Voting Algorithm | LeetCode 169 | $O(N)$ | $O(1)$ |
| [`LongestConsecutiveSequence.java`](LongestConsecutiveSequence.java) | Sorting / Set-based sequence | LeetCode 128 | $O(N \log N)$ | $O(1)$ |
| [`SubarraySumEqualsK.java`](SubarraySumEqualsK.java) | Prefix sum hash lookup | LeetCode 560 | $O(N)$ | $O(N)$ |
| [`TargetSum1477.java`](TargetSum1477.java) | Non-overlapping subarrays target sum | LeetCode 1477 | $O(N)$ | $O(N)$ |
| [`RunningSum.java`](RunningSum.java) | 1D Prefix running sum | LeetCode 1480 | $O(N)$ | $O(1)$ |
| [`RangeSumQuery.java`](RangeSumQuery.java) | Prefix sum immutable query | LeetCode 303 | Query: $O(1)$ | $O(N)$ |
| [`SearchInsertPosition.java`](SearchInsertPosition.java) | Binary Search lower bound | LeetCode 35 | $O(\log N)$ | $O(1)$ |
| [`Sqrt.java`](Sqrt.java) | Binary search square root | LeetCode 69 | $O(\log X)$ | $O(1)$ |
| [`RotateImage.java`](RotateImage.java) | Transpose + reverse 90° rotation | LeetCode 48 | $O(N^2)$ | $O(1)$ |
| [`MoveZeroes.java`](MoveZeroes.java) | Two pointers in-place compaction | LeetCode 283 | $O(N)$ | $O(1)$ |
| [`RemoveDuplicates.java`](RemoveDuplicates.java) | In-place unique array compaction | LeetCode 26 | $O(N)$ | $O(1)$ |
| [`MissingNumber.java`](MissingNumber.java) | XOR / Arithmetic summation | LeetCode 268 | $O(N)$ | $O(1)$ |
| [`SingleNumber.java`](SingleNumber.java) | XOR bit manipulation | LeetCode 136 | $O(N)$ | $O(1)$ |
| [`MaxConsecutiveOnes.java`](MaxConsecutiveOnes.java) | Linear counter scan | LeetCode 485 | $O(N)$ | $O(1)$ |
| [`PalindromeNumber.java`](PalindromeNumber.java) | Integer reversal check | LeetCode 9 | $O(\log_{10} N)$ | $O(1)$ |
| [`PlusOne.java`](PlusOne.java) | Large integer increment | LeetCode 66 | $O(N)$ | $O(1)$ |
| [`PlusOneVariant.java`](PlusOneVariant.java) | Plus one implementation variant | Practice | $O(N)$ | $O(1)$ |
| [`Largest.java`](Largest.java) | Finding maximum element | Core DSA | $O(N)$ | $O(1)$ |
| [`SecondLargest.java`](SecondLargest.java) | Two-variable single-pass scan | Core DSA | $O(N)$ | $O(1)$ |
| [`ReverseArray.java`](ReverseArray.java) | Two-pointer array reversal | Core DSA | $O(N)$ | $O(1)$ |
| [`CheckSubarray.java`](CheckSubarray.java) | Subarray membership verification | Core DSA | $O(N)$ | $O(1)$ |
| [`CheckArraySortedAndRotated.java`](CheckArraySortedAndRotated.java) | Inversion count rotation check | LeetCode 1752 | $O(N)$ | $O(1)$ |
| [`SubsetsKOverlapping.java`](SubsetsKOverlapping.java) | Non-overlapping segment subsets | LeetCode 1621 | $O(N \cdot K)$ | $O(N \cdot K)$ |
| [`Question3903.java`](Question3903.java) | Assessment question | Practice | $O(N)$ | $O(1)$ |
| [`NextGreaterElement.cpp`](NextGreaterElement.cpp) | Next Greater Element (C++) | LeetCode 496 | $O(N)$ | $O(N)$ |

---

## ▶️ How to Run

Compile and run any standalone array problem from the repository root:

```bash
# Compile
javac Arrays/TwoSum.java

# Run
java Arrays.TwoSum
```

---

**Author:** Yashika Garg
