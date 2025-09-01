package string.easy;

import string.easy.problem.BinaryTreePaths257;

import java.util.ArrayList;
import java.util.List;

public class Solution257 implements BinaryTreePaths257 {
    /*
     *  There are 2 types root node and leaf nodes using dfs check if the node is leaf node if yes add the path to the list
     * else keep traversing the tree using recursion checking if node is null or not
     * */
    @Override
    public List<String> binaryTreePaths(TreeNode root) {
        var paths = new ArrayList<String>();
        dfs(root, "", paths);
        return paths;
    }

    private void dfs(TreeNode node, String path, List<String> paths) {
        if(node == null) return;
        path += node.val;
        if(node.left == null && node.right == null) {
            paths.add(path);
        } else {
            path += "->";
            dfs(node.left, path, paths);
            dfs(node.right, path, paths);
        }
    }
}

