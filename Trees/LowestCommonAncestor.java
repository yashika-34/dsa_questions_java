package Trees;

public class LowestCommonAncestor {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root; // Root is the lowest common ancestor
        }

        return left != null ? left : right;
    }

    public static void main(String[] args) {
        // Construct tree:
        //        3
        //       / \
        //      5   1
        //     / \
        //    6   2
        TreeNode root = new TreeNode(3);
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);
        root.left = p;
        root.right = q;
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        TreeNode lca = lowestCommonAncestor(root, p, q);
        System.out.println("LCA of " + p.val + " and " + q.val + " is: " + lca.val); // Output: 3
    }
}