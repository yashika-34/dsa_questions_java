package Trees;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }

    private static void inorder(TreeNode root, List<Integer> ans) {
        if (root == null) return;

        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }

    public static void main(String[] args) {
        // Construct sample tree:
        //      1
        //       \
        //        2
        //       /
        //      3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("Inorder Traversal: " + inorderTraversal(root));
    }
}
