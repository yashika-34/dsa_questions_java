# 🚶‍♂️ Queue DSA Problems in Java

This folder contains my implementations and practice problems on **Queues** using Java.

---

## 📌 Overview

A **Queue** is a linear data structure that follows the **FIFO (First In, First Out)** principle. The element added first is the first one to be removed. Insertions occur at the **Rear** (or Back/Tail) and deletions occur at the **Front** (or Head).

### Fundamental Operations:
- `enqueue(x)` / `offer(x)` / `add(x)`: Inserts element `x` at the rear of the queue — $O(1)$
- `dequeue()` / `poll()` / `remove()`: Removes and returns the front element — $O(1)$
- `peek()` / `front()`: Returns the element at the front without removing it — $O(1)$
- `isEmpty()`: Checks whether the queue has zero elements — $O(1)$

---

## 📚 Concepts & Patterns Covered

1. **Queue from Scratch:**
   - Array-based implementation (`QueueArray.java`) managing `front`, `rear`, and capacity.
   - Node-based linked list implementation (`QueueLinkedList.java`) with $O(1)$ enqueue/dequeue via `front` and `rear` pointers.
2. **Reversals:**
   - Complete queue reversal using an auxiliary Stack (`ReverseQueue.java`).
   - Reversing the first $K$ elements of a queue using a Stack while maintaining the order of the remaining elements (`ReverseFirstKElements.java`).
3. **Dual Data Structure Design:**
   - **Queue using Stacks:** Implementing FIFO behavior using two LIFO stacks with amortized $O(1)$ push/pop (`QueueUsingStacks.java` - LeetCode 232).
   - **Stack using Queues:** Implementing LIFO behavior using two queues (`StackUsingQueues.java` - LeetCode 225).
4. **Sliding Window with Queue:**
   - Finding the **First Negative Integer** in every contiguous window of size $K$ using a queue to track negative element indices (`FirstNegativeWindow.java`).
5. **Stream Processing:**
   - Finding the **First Non-Repeating Character** in a character stream using a frequency array and queue (`FirstNonRepeating.java`).
6. **Breadth-First Generation:**
   - Generating binary representations from $1$ to $N$ systematically using queue-based level generation (`GenerateBinaryNumbers.java`).

---

## 📂 Files & Implementations

| File | Problem / Concept | LeetCode / Topic | Time Complexity | Space Complexity |
|---|---|:---:|:---:|:---:|
| [`QueueArray.java`](QueueArray.java) | Queue implementation from scratch using dynamic array | Core DSA | Enqueue/Dequeue: $O(1)$ | $O(N)$ |
| [`QueueLinkedList.java`](QueueLinkedList.java) | Queue implementation from scratch using Linked List nodes | Core DSA | Enqueue/Dequeue: $O(1)$ | $O(N)$ |
| [`ReverseQueue.java`](ReverseQueue.java) | Reverse a Queue using an auxiliary Stack | Classic DSA | $O(N)$ | $O(N)$ |
| [`ReverseFirstKElements.java`](ReverseFirstKElements.java) | Reverse the first $K$ elements of a Queue | GfG Classic | $O(N)$ | $O(K)$ |
| [`QueueUsingStacks.java`](QueueUsingStacks.java) | Implement Queue using two Stacks | LeetCode 232 | Amortized $O(1)$ | $O(N)$ |
| [`StackUsingQueues.java`](StackUsingQueues.java) | Implement Stack using two Queues | LeetCode 225 | Push: $O(N)$, Pop/Top: $O(1)$ | $O(N)$ |
| [`FirstNegativeWindow.java`](FirstNegativeWindow.java) | First negative integer in every window of size $K$ | Sliding Window / GfG | $O(N)$ | $O(K)$ |
| [`FirstNonRepeating.java`](FirstNonRepeating.java) | First non-repeating character in a stream | Stream / LeetCode Equivalent | $O(N)$ | $O(1)$ auxiliary (26 chars) |
| [`GenerateBinaryNumbers.java`](GenerateBinaryNumbers.java) | Generate binary numbers from 1 to $N$ via Queue BFS | BFS Pattern | $O(N)$ | $O(N)$ |

---

## ⏱️ Complexity Summary

| Operation / Algorithm | Time Complexity | Space Complexity |
|---|:---:|:---:|
| **Array Queue (Enqueue / Dequeue / Peek)** | $O(1)$ | $O(N)$ total storage |
| **Linked List Queue (Enqueue / Dequeue / Peek)** | $O(1)$ | $O(N)$ total storage |
| **Reverse Queue / First K Elements** | $O(N)$ | $O(N)$ / $O(K)$ |
| **Queue Using Stacks** | Amortized $O(1)$ | $O(N)$ |
| **Stack Using Queues** | Push: $O(N)$, Pop: $O(1)$ | $O(N)$ |
| **First Negative in Window of size $K$** | $O(N)$ | $O(K)$ |
| **First Non-Repeating Character in Stream** | $O(N)$ | $O(1)$ auxiliary |
| **Generate Binary Numbers 1 to $N$** | $O(N)$ | $O(N)$ |

---

## ▶️ How to Run

Compile and run any Queue problem from the repository root:

```bash
# Compile
javac Queue/QueueArray.java

# Run
java Queue.QueueArray
```

Or for interactive / scanner-based problems:
```bash
# Compile
javac Queue/GenerateBinaryNumbers.java

# Run
java Queue.GenerateBinaryNumbers
```

---

**Author:** Yashika Garg
