package string.easy.problem;

import java.util.List;

public interface BinaryTreePaths257 {
    /*
     * Given the root of a binary tree, return all root-to-leaf paths in any order.
     * A leaf is a node with no children.
     * */

    class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    List<String> binaryTreePaths(TreeNode root);
}
