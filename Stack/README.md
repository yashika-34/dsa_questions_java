# 📚 Stack DSA Problems in Java

This folder contains my implementations and practice problems on **Stacks** using Java.

---

## 📌 Overview

A **Stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle. The element added last is the first one to be removed. All insertions and deletions take place at a single end called the **Top**.

### Fundamental Operations:
- `push(x)`: Inserts element `x` onto the top of the stack — $O(1)$
- `pop()`: Removes and returns the topmost element — $O(1)$
- `peek()` / `top()`: Returns the topmost element without removal — $O(1)$
- `isEmpty()`: Checks whether the stack has zero elements — $O(1)$

---

## 📚 Concepts & Patterns Covered

1. **Stack from Scratch:**
   - Dynamic array-based implementation (`StackArray.java`).
   - Node-based linked list implementation (`StackLinkedList.java`).
2. **Monotonic Stack Pattern:**
   - Finding the **Next Greater Element** in $O(N)$ time using a monotonic decreasing stack (`NextGreater.java`).
3. **Expression Parsing & Arithmetic Evaluation:**
   - Operator precedence rules.
   - **Infix to Postfix conversion** (`InfixtoPostfix.java`).
   - Evaluating expressions in **Postfix** and **Prefix** notations (`EvaluatePostfix.java`, `EvaluatePrefix.java`).
4. **Design Problems:**
   - **Min Stack:** Tracking the minimum element at any point in $O(1)$ time (`MinStack.java`).
   - **Bracket Matching & Balancing:** Valid Parentheses (`ValidParentheses.java`) and Minimum Reversals required (`MinReversal.java`).

---

## 📂 Files & Implementations

| File | Problem / Concept | LeetCode / Topic | Time Complexity | Space Complexity |
|---|---|:---:|:---:|:---:|
| [`StackArray.java`](StackArray.java) | Stack implementation from scratch using dynamic array | Core DSA | Push/Pop: $O(1)$ | $O(N)$ |
| [`StackLinkedList.java`](StackLinkedList.java) | Stack implementation from scratch using Linked List nodes | Core DSA | Push/Pop: $O(1)$ | $O(N)$ |
| [`ValidParentheses.java`](ValidParentheses.java) | Valid Parentheses / Bracket matching | LeetCode 20 | $O(N)$ | $O(N)$ |
| [`NextGreater.java`](NextGreater.java) | Next Greater Element using Monotonic Stack | LeetCode 496 / 503 | $O(N)$ | $O(N)$ |
| [`MinStack.java`](MinStack.java) | Min Stack: Retrieve minimum in $O(1)$ time | LeetCode 155 | $O(1)$ all ops | $O(N)$ |
| [`InfixtoPostfix.java`](InfixtoPostfix.java) | Infix to Postfix notation conversion | Core Algorithm | $O(N)$ | $O(N)$ |
| [`EvaluatePostfix.java`](EvaluatePostfix.java) | Arithmetic evaluation of Postfix expressions | Core Algorithm | $O(N)$ | $O(N)$ |
| [`EvaluatePrefix.java`](EvaluatePrefix.java) | Arithmetic evaluation of Prefix expressions | Core Algorithm | $O(N)$ | $O(N)$ |
| [`MinReversal.java`](MinReversal.java) | Minimum bracket reversals to balance expression | GfG Classic | $O(N)$ | $O(N)$ |

---

## ⏱️ Complexity Summary

| Operation / Algorithm | Time Complexity | Space Complexity |
|---|:---:|:---:|
| **Push / Pop / Peek / isEmpty** | $O(1)$ | $O(1)$ auxiliary |
| **Monotonic Stack (Next Greater)** | $O(N)$ | $O(N)$ |
| **Expression Evaluation** | $O(N)$ | $O(N)$ |
| **Min Stack operations** | $O(1)$ | $O(N)$ total storage |

---

## ▶️ How to Run

Compile and run any standalone stack problem directly:

```bash
# Compile
javac Stack/ValidParentheses.java

# Run
java Stack.ValidParentheses
```

---

**Author:** Yashika Garg
