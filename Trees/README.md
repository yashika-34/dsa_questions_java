# 🌳 Binary Trees DSA in Java

This folder contains my implementations and problem solutions on **Binary Trees** using Java.

---

## 📌 Core Concepts

A **Binary Tree** is a hierarchical data structure where each node has at most two children, referred to as the `left` child and the `right` child.

### Node Structure
```java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
```

---

## 📚 Topics Covered

- **Tree Traversals (Depth-First Search):**
  - **Inorder (Left $\rightarrow$ Root $\rightarrow$ Right):** Produces sorted order for Binary Search Trees.
  - **Preorder (Root $\rightarrow$ Left $\rightarrow$ Right):** Useful for cloning or serializing trees.
  - **Postorder (Left $\rightarrow$ Right $\rightarrow$ Root):** Useful for bottom-up deletion and subtree evaluations.
- **Tree Metrics:** Finding the maximum depth / height of a binary tree recursively.
- **Ancestor Queries:** Finding the **Lowest Common Ancestor (LCA)** of two nodes in $O(N)$ time.

---

## 📂 Files & Problem Solutions

| File | Problem / Concept | LeetCode | Time Complexity | Space Complexity |
|---|---|:---:|:---:|:---:|
| [`TreeNode.java`](TreeNode.java) | Node structure & Postorder Traversal | LeetCode 145 | $O(N)$ | $O(H)$ recursion stack |
| [`Main.java`](Main.java) | Tree construction & Inorder Traversal driver | LeetCode 94 | $O(N)$ | $O(H)$ recursion stack |
| [`104_Maximum_depth_ofTree.java`](104_Maximum_depth_ofTree.java) | Maximum Depth of Binary Tree | LeetCode 104 | $O(N)$ | $O(H)$ |
| [`236_minAncestor.java`](236_minAncestor.java) | Lowest Common Ancestor (LCA) | LeetCode 236 | $O(N)$ | $O(H)$ |

*(Where $N$ is the number of nodes and $H$ is the tree height: $O(\log N)$ for balanced trees, $O(N)$ for skewed trees).*

---

## ⏱️ Key Complexity Insights

| Algorithm | Best / Average Time | Worst Case Time | Auxiliary Space |
|---|:---:|:---:|:---:|
| **Tree Traversals (DFS)** | $O(N)$ | $O(N)$ | $O(H)$ call stack |
| **Height / Max Depth** | $O(N)$ | $O(N)$ | $O(H)$ call stack |
| **Lowest Common Ancestor** | $O(N)$ | $O(N)$ | $O(H)$ call stack |

---

## ▶️ How to Run

Compile and run the driver class from the repository root:

```bash
# Compile
javac Trees/Main.java

# Run
java Trees.Main
```

---

**Author:** Yashika Garg
