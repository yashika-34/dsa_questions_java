# ⛰️ Heap DSA Problems in Java

This folder contains my implementations and practice problems on **Heaps (Priority Queues)** using Java.

---

## 📌 Overview

A **Heap** is a specialized tree-based data structure that satisfies the heap property:
- **Max Heap:** The key at the root must be the greatest among all keys present in the heap, and the same property recursively holds for all subtrees.
- **Min Heap:** The key at the root must be the smallest among all keys present in the heap, and the same property recursively holds for all subtrees.

Heaps are typically represented using arrays or dynamic lists (`ArrayList`), where for an element at index `i`:
- **Parent:** `(i - 1) / 2`
- **Left Child:** `2 * i + 1`
- **Right Child:** `2 * i + 2`

---

## 📚 Concepts Covered

- **Min Heap Implementation:** Full Min Heap class with dynamic resizing using `ArrayList`.
- **Max Heap Operations:** Step-by-step implementations of insertion, root deletion, and peek.
- **Heapify (Down):** Restoring the heap property downwards after root removal or during heap construction.
- **Build Heap:** Efficiently building a heap from an unsorted array in $O(N)$ time by heapifying non-leaf nodes in reverse order.
- **Heap Sort:** Sorting an array in-place in $O(N \log N)$ time by repeatedly extracting the maximum element.
- **K Largest Elements:** Efficiently finding the top $K$ largest elements using a Min Heap.

---

## 📂 Files & Implementations

| File | Description | Time Complexity |
|---|---|---|
| [`MinHeap.java`](MinHeap.java) | Complete Min Heap implementation with `insert()`, `deleteRoot()`, `peek()`, and `heapifyDown()` | Insert: $O(\log N)$, Delete: $O(\log N)$, Peek: $O(1)$ |
| [`HeapInsert.java`](HeapInsert.java) | Max Heap insertion with upward heapify (sift-up) | $O(\log N)$ |
| [`HeapDelete.java`](HeapDelete.java) | Deleting the root element from a Max Heap and restoring the heap property | $O(\log N)$ |
| [`HeapPeek.java`](HeapPeek.java) | Retrieving the maximum / root element without removal | $O(1)$ |
| [`Heapify.java`](Heapify.java) | Downward heapify function to restore the Max Heap property at index `i` | $O(\log N)$ |
| [`BuildHeap.java`](BuildHeap.java) | Building a Max Heap from an arbitrary array starting from index `(N/2 - 1)` | $O(N)$ |
| [`HeapSort.java`](HeapSort.java) | In-place Heap Sort algorithm in ascending order using Max Heap | $O(N \log N)$ |
| [`KLargestElements.java`](KLargestElements.java) | Finding the $K$ largest elements in an array using a Min Heap | $O(N \log K)$ |

---

## ⏱️ Time & Space Complexity Summary

| Operation | Time Complexity | Space Complexity |
|---|---|---|
| **Insert** | $O(\log N)$ | $O(1)$ |
| **Delete Root** | $O(\log N)$ | $O(1)$ |
| **Peek / Get Max/Min** | $O(1)$ | $O(1)$ |
| **Heapify** | $O(\log N)$ | $O(1)$ auxiliary (iterative) |
| **Build Heap** | $O(N)$ | $O(1)$ auxiliary |
| **Heap Sort** | $O(N \log N)$ | $O(1)$ auxiliary |

---

## 🛠️ Language Used

- **Java** (JDK 8+)

---

## ▶️ How to Run

Because the files use the package `heaps;`, compile and run them from the root directory of the repository:

**1. Compile a file:**
```bash
javac heaps/MinHeap.java
```

**2. Run the program:**
```bash
java heaps.MinHeap
```

You can replace `MinHeap` with any other class such as `HeapSort`, `BuildHeap`, `HeapDelete`, `HeapInsert`, or `HeapPeek`.

---

## 🎯 Objective

To understand the internal mechanics of Priority Queues and Binary Heaps, learn how complete binary trees are mapped to linear arrays, and apply heaps to solve competitive programming and technical interview problems.

---

## 🌱 Practice

I regularly solve heap problems and upload clean, well-commented solutions to improve my understanding of Data Structures and Algorithms.

---

**Author:** Yashika Garg
