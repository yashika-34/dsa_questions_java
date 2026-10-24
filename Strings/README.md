# 🔤 Strings DSA in Java

This folder contains my solutions and practice problems on **String Manipulations, Parsing, and Matching** using Java.

---

## 📌 Core Concepts & Techniques

1. **Character Frequency Arrays (Hashing):**
   - Using fixed-size 26-element integer arrays (`int[26]`) for efficient $O(1)$ auxiliary space anagram validation (`ValidAnagrams.java`).
2. **String Parsing & State Machines:**
   - Robust parsing handling leading whitespaces, sign extraction (`+`/`-`), integer overflow checking against `Integer.MAX_VALUE` and `Integer.MIN_VALUE` (`StringToAtoi.java`).
3. **Sub-string Search & Pattern Matching:**
   - Searching for needle occurrences within a haystack string (`FindIndex.java`).

---

## 📂 Problem Index

| File | Problem Description | LeetCode | Time Complexity | Space Complexity |
|---|---|:---:|:---:|:---:|
| [`ValidAnagrams.java`](ValidAnagrams.java) | Valid Anagram using 26-char frequency counting | LeetCode 242 | $O(N)$ | $O(1)$ |
| [`StringToAtoi.java`](StringToAtoi.java) | String to Integer (`atoi`) with overflow clamping | LeetCode 8 | $O(N)$ | $O(1)$ |
| [`FindIndex.java`](FindIndex.java) | Find the Index of the First Occurrence in a String (`strStr`) | LeetCode 28 | $O(N \cdot M)$ | $O(1)$ |

---

## ▶️ How to Run

Compile and run any string solution from the repository root:

```bash
# Compile
javac Strings/ValidAnagrams.java

# Run
java Strings.ValidAnagrams
```

---

**Author:** Yashika Garg
